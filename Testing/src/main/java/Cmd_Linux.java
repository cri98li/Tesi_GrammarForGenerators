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
}
