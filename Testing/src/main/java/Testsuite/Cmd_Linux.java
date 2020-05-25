package Testsuite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cmd_Linux {
	public static int execute(String cmd, String opt, String msg) throws IOException, InterruptedException {
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command(cmd, opt, msg);
		processBuilder.redirectErrorStream(true);
		Process process = processBuilder.start();
		BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = bufferedReader.readLine()) != null)
        	System.out.println(line);
        
        return process.waitFor();
	}

	public static void getProject() throws IOException, InterruptedException {
		int returnCode = Cmd_Linux.execute("git", "clone", "https://"+ System.getenv("GIT_USER") + ":" + System.getenv("GIT_PASSW") +
				"@github.com/cri98li/JSONSchema-Algebra.git");
		System.out.println("git clone: "+ returnCode);


		returnCode = Cmd_Linux.execute("bash", "-c", "export JAVA_HOME=/usr/lib/jvm/java-11-openjdk/;"
				+ "cd JSONSchema-Algebra/Programmi/JsonSchema_to_Algebra/;"
				+ "mvn install;"
				+ "cp target/JsonSchema_to_Algebra-0.0.1-SNAPSHOT-jar-with-dependencies.jar ../../../eseguibile.jar;"
				+ "cd ../../../; " //rm -r -f JSONSchema-Algebra/
		);
		System.out.println("ottenimento progetto: "+returnCode);
	}
}
