package Testsuite.RandomTest;

import Testsuite.Cmd_Linux;
import Testsuite.Test;
import Testsuite.TestBuilder;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class RandomTestBuilder extends TestBuilder {
	private final boolean destroyed;
	private final List<Integer> tests;

	public RandomTestBuilder(List<Integer> tests) throws IOException, InterruptedException {
		Cmd_Linux.getProject();
		buildPythonFile();

		destroyed = false;
		this.tests = new LinkedList<>(tests);
	}
	
	private void buildPythonFile() throws IOException, InterruptedException {
		int returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-process ../Algebra/Algebra.g4 -o tmp/ --no-actions;");
		System.out.println("returncode creazione parser algebra: "+returnCode);

		returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-process ../JSONSchema/JSONSchema.g4 -o tmp/ --no-actions;");
		System.out.println("returncode creazione parser jsonschema: "+returnCode);

		returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-process ../Algebra/Algebra.g4 -o tmp/ --no-actions;");
		System.out.println("returncode creazione parser algebra: "+returnCode);
	}
	
	
	

	
	public List<Test> getTests() throws IOException, InterruptedException {
		if(destroyed) return null;

		Cmd_Linux.execute("bash", "-c", "rm -r -f testFiles");

		List<Test> generatedTests = new LinkedList<>();

		//GENERAZIONE TEST

		for(int i = 0; i < tests.size(); i++){
			int returnCode = 32;
			if(tests.get(i) == 0) continue;
			switch (i+1){
				case 2:
				case 3:
					returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-generate -d 20 "
							+ " -o testFiles/"+ (i+1) +"-test_%d.input -p tmp/AlgebraUnparser.py -l tmp/AlgebraUnlexer.py 	" +
							" -n "+tests.get(i));
					break;

				case 1:
					returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-generate -d 50 "
							+ " -o testFiles/"+ (i+1) +"-test_%d.input -p tmp/JSONSchemaUnparser.py -l tmp/JSONSchemaUnlexer.py 	" +
							" -n "+tests.get(i));
					break;

			}

			System.out.println("> returncode creazione testfile "+ (i+1) +": "+ returnCode);
		}

		File generatedTestFolder = new File("testFiles/");
		for(File file : generatedTestFolder.listFiles()){
			if(!file.isFile() || !file.getName().contains(".input")) continue;
			String fileName = file.getName();
			String command = fileName.split("-")[0];
			generatedTests.add(new RandomTest(command, fileName));
		}

		return generatedTests;
	}
	
	public boolean shutdown() {

		int returnCode = 0;
		try {
			returnCode = Cmd_Linux.execute("bash", "-c", "rm -r -f tmp/" +
					"rm -r -f eseguibile.jar");
			return returnCode == 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
    }
}












