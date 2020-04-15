import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class TestBuilder{
	private static TestBuilder istance;
	
	private boolean destroyed;
	private List<Integer> tests;
	
	public static TestBuilder setup(List<Integer> tests) throws IOException, InterruptedException {
		synchronized(Test.class) {
			if(istance == null) istance = new TestBuilder(tests);
		}
		
		return istance;
	}
	
	private void getProject() throws IOException, InterruptedException {
		int returnCode = Cmd_Linux.execute("git", "clone", "https://"+ Credenziali.username + ":" + Credenziali.password +
				"@github.com/cri98li/JSONSchema-Algebra.git");
		System.out.println("git clone: "+ returnCode);
		
		
		returnCode = Cmd_Linux.execute("bash", "-c", "export JAVA_HOME=/usr/lib/jvm/java-11-openjdk/;"
				+ "cd JSONSchema-Algebra/Programmi/JsonSchema_to_Algebra/; ls;"
				+ "mvn install;"
				+ "cp target/JsonSchema_to_Algebra-0.0.1-SNAPSHOT-jar-with-dependencies.jar ../../../eseguibile.jar;"
				//+ "cd ../../../; rm -r -f JSONSchema-Algebra/ "
				);
        System.out.println("prova: "+returnCode);
	}
	
	private void buildPythonFile() throws IOException, InterruptedException {
		int returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-process ../Algebra/Algebra.g4 -o tmp/ --no-actions;");
		System.out.println("returncode creazione parser algebra: "+returnCode);

		returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-process ../JSONSchema/JSONSchema.g4 -o tmp/ --no-actions;");
		System.out.println("returncode creazione parser jsonschema: "+returnCode);

		returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-process ../Algebra/Algebra.g4 -o tmp/ --no-actions;");
		System.out.println("returncode creazione parser algebra: "+returnCode);
	}
	
	
	
	
	
	
	
	
	
	
	
	private TestBuilder(List<Integer> tests) throws IOException, InterruptedException {
		getProject();
		buildPythonFile();
		
		destroyed = false;
		this.tests = new LinkedList<>(tests);
	}
	
	public List<Test> getTests() throws IOException, InterruptedException {
		if(destroyed) return null;

		List<Test> generatedTests = new LinkedList<>();

		//GENERAZIONE TEST

		for(int i = 0; i < tests.size(); i++){
			int returnCode = 32;
			if(tests.get(i) == 0) continue;
			switch (i+1){
				case 2:
					returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-generate -d 30"
							+ " -o testFiles/"+ (i+1) +"-test_%d.input -p tmp/AlgebraUnparser.py -l tmp/AlgebraUnlexer.py 	" +
							" -n "+tests.get(i));
					break;

				case 1:
				case 3:
					returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-generate -d 100 "
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
			generatedTests.add(new Test(command, fileName));
		}

		return generatedTests;
	}
	
	public boolean shutdown() {

			int returnCode = 1;/*Cmd_Linux.execute("bash", "-c", "rm -r -f tmp/");*/
			if(returnCode == 0) return true;

        
		return false;
	}
}


class Test implements Runnable{
	private String inputFileName;
	private String command;
	
	protected Test(String command, String inputFileName) {
		this.inputFileName = inputFileName;
		this.command = command;
	}

	@Override
	public void run() {
        //eseguo il test
		try{
        int returnCode = Cmd_Linux.execute("bash", "-c", "/usr/lib/jvm/java-11-openjdk/bin/java -cp eseguibile.jar "
        		+ "it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.MainClass " 
        		+ command + " testFiles/" + inputFileName + " &> testFiles/" + inputFileName + ".output");
        if(returnCode == 0) {
        	returnCode = Cmd_Linux.execute("bash", "-c", "rm -f -r testFiles/"+inputFileName+".input;"
      				+ "rm -f -r testFiles/"+inputFileName+".output");
              System.out.println(inputFileName+"> eliminazione file test di successo: "+returnCode);
        	return;
        }
        
        
        
        
        
        
        
      //se sono arrivato fin qui il test non ha avuto successo --> non elimino i file
              
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}












