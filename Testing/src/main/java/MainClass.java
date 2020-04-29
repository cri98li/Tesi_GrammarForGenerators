import Testsuite.Compare.CompareTestBuilder;
import Testsuite.Test;
import Testsuite.RandomTest.RandomTestBuilder;
import Testsuite.TestBuilder;
import Testsuite.TestFolder.FolderTest;
import Testsuite.TestFolder.FolderTestBuilder;
import org.apache.commons.cli.*;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

public class MainClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		Long start = System.currentTimeMillis();

		CommandLineParser parser = new DefaultParser();
		CommandLine commandLine;

		try{
			commandLine = parser.parse(prepareOptions(), args);
		} catch (ParseException e) {
			new HelpFormatter().printHelp("Testing", prepareOptions());
			return;
		}

		if(commandLine.getOptions().length == 0) {
			new HelpFormatter().printHelp("Testing", prepareOptions());
			return;
		}

		TestBuilder testBuilder = null;











		if(commandLine.hasOption("r")) {
			String[] options = commandLine.getOptionValues("r");
			List<Integer> testId = new LinkedList<>();

			for (int i = 0; i < options.length; i++)
				testId.add(Integer.parseInt(options[i]));

			testBuilder = new RandomTestBuilder(testId);
		}










		if(commandLine.hasOption("c")){
			File fileFolder = new File(commandLine.getOptionValue("c", "./"));
			LinkedHashMap<String, Boolean> hm = new LinkedHashMap<>();
			for(File file : fileFolder.listFiles()){
				if(!file.isFile()) continue;
				String fileName = file.getName();

				if(!fileName.startsWith("input")
					&& !fileName.startsWith("output"))
					continue;

				String fn = fileName.replace("input", "").replace("output", "");

				hm.put(fn, hm.containsKey(fn));
			}

			TreeMap<String, String> fileSet = new TreeMap<>();

			Set<Map.Entry<String, Boolean>> entrySet = hm.entrySet();

			for(Map.Entry<String, Boolean> entry : entrySet)
				if(entry.getValue())
					fileSet.put(fileFolder.getPath()+"/input" + entry.getKey(), fileFolder.getPath()+"/output"+entry.getKey() );


			testBuilder = new CompareTestBuilder(fileSet);
			}












		if(commandLine.hasOption("t")){
			testBuilder = new FolderTestBuilder(commandLine.getOptionValue("t"));
			ExecutorService executors = Executors.newFixedThreadPool(1);
			List<Test> tests = testBuilder.getTests();
			for (Test test : tests)
				executors.execute(test);

			executors.shutdown();

			while (!executors.awaitTermination(1, TimeUnit.SECONDS)) {
				//System.out.println("MANCANO"+ executors. +"TEST");
			}

			int testTotali = tests.size();
			int testPassati = 0;
			for (Test t : tests) {
				if (t.getResult()) testPassati++;
			}

			System.out.println("TEST SUPERATI: " + testPassati + "/" + testTotali);

			testBuilder.shutdown();

			for(int i = 0; i < args.length; i++)
				if(args[i].equals("-t") || args[i].equals("--testFolder"))
					args[i] = "-c";

			if(commandLine.hasOption("d")){
				for(Test t : tests)
					if(t.getResult())
						for(String path : t.getInputFiles())
							new File(path).delete();
			}

			System.out.println(Arrays.toString(args));
			main(args);

			return;
		}











		if(testBuilder != null) {
			ExecutorService executors = Executors.newFixedThreadPool(3);
			List<Test> tests = testBuilder.getTests();
			for (Test test : tests)
				executors.execute(test);

			executors.shutdown();

			while (!executors.awaitTermination(1, TimeUnit.SECONDS)) {
				//System.out.println("MANCANO"+ executors. +"TEST");
			}

			int testTotali = tests.size();
			int testPassati = 0;
			for (Test t : tests)
				if (t.getResult()) testPassati++;

			System.out.println("TEST SUPERATI: " + testPassati + "/" + testTotali);

			testBuilder.shutdown();

			if(commandLine.hasOption("d")){
				for(Test t : tests)
                    if(t.getResult()){
                        for(String path : t.getInputFiles())
                            new File(path).delete();

                        for(String path : t.getOutputFiles())
                            new File(path).delete();
                    }
			}
		}


		System.out.println("\t\tTEMPO IMPIEGATO: "+ (System.currentTimeMillis() - start) +" millisecondi");
		System.out.println("\t\tTEMPO IMPIEGATO: "+ (System.currentTimeMillis() - start)/1000 +" secondi");
		System.out.println("\t\tTEMPO IMPIEGATO: "+ (System.currentTimeMillis() - start)/(1000*60) +" minuti");
	}


	private static Options prepareOptions(){
		Options options = new Options();

		Option randomOption = Option.builder("r")
				.longOpt("random")
				.hasArg()
				.numberOfArgs(3)
				.argName("test1> <Test2> <Test3")
				.valueSeparator(' ')
				.type(Integer.class)
				.desc("Execute random test")
				.build();

		Option compareOption = Option.builder("c")
				.longOpt("compare")
				.desc("Compare all couple of <input*, output*>")
				.hasArg()
				.optionalArg(true)
				.argName("folder")
				.type(String.class)
				.build();

		Option deleteOption = Option.builder("d")
				.longOpt("delete")
				.desc("Delete all file generated by a successful test")
				.build();

		Option testFolderOption = Option.builder("t")
				.longOpt("testFolder")
				.desc("Run a all possible test based on file format (.json or .algebra) in a specified folder")
				.hasArg()
				.argName("folder")
				.type(String.class)
				.build();

		return options.addOption(randomOption)
				.addOption(compareOption)
				.addOption(deleteOption)
				.addOption(testFolderOption);
	}
}
