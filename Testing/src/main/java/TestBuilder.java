import java.io.IOException;
import java.util.Random;


public class TestBuilder{
	private static TestBuilder istance;
	
	private boolean destroyed;
	
	private TestBuilder() throws IOException, InterruptedException {
		getProject();
		buildPythonFile();
		
		destroyed = false;
	}
	
	public static TestBuilder setup() throws IOException, InterruptedException {
		synchronized(Test.class) {
			if(istance == null) istance = new TestBuilder();
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
				+ "cd ../../../; rm -r -f JSONSchema-Algebra/ "
				);
        System.out.println("prova: "+returnCode);
	}
	
	private void buildPythonFile() throws IOException, InterruptedException {
		int returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-process ../Algebra/Algebra.g4 -o tmp/ --no-actions");
        System.out.println("returncode creazione parser: "+returnCode);
	}
	
	public Test getTest() {
		if(destroyed) return null;
		try {
			return new Test();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean shutdown() {
		try {
			int returnCode = Cmd_Linux.execute("bash", "-c", "rm -r -f tmp/");
			if(returnCode == 0) return true;
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
        
		return false;
	}
}


class Test implements Runnable{
	private String fileName;
	
	protected Test() throws IOException, InterruptedException {
		fileName = this.hashCode()+"";
	}

	@Override
	public void run() {
		int command = new Random().nextInt(3) +1;
		String inputFile = command + "input_" + fileName;
		String outputFile = command + "output_" + fileName;
		//Creo il file di test
		try {
		int returnCode = Cmd_Linux.execute("bash", "-c", "grammarinator-generate -r rootDef_assertion "
				+ "-d 10 -o testFiles/" + inputFile + ".txt -p tmp/AlgebraUnparser.py -l tmp/AlgebraUnlexer.py;"
        		+ "mv testFiles/" + inputFile + "*.txt testFiles/" + inputFile + ".txt");
		
		System.out.println(fileName + "> returncode creazione testfile: "+ returnCode);
		if(returnCode != 0) return;
        
        //eseguo il test
        returnCode = Cmd_Linux.execute("bash", "-c", "/usr/lib/jvm/java-11-openjdk/bin/java -cp eseguibile.jar "
        		+ "it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.MainClass " 
        		+ command + " testFiles/" + inputFile + ".txt &> testFiles/" + outputFile + ".txt");
        if(returnCode == 0) {
        	returnCode = Cmd_Linux.execute("bash", "-c", "rm -f -r testFiles/"+inputFile+".txt;"
      				+ "rm -f -r testFiles/"+outputFile+".txt");
              System.out.println(fileName+"> eliminazione file test di successo: "+returnCode);
        	return;
        }
        
        
        
        
        
        
        
      //se sono arrivato fin qui il test non ha avuto successo --> non elimino i file
              
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}












