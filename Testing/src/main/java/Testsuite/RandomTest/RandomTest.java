package Testsuite.RandomTest;


import Testsuite.Test;

import java.util.List;

class RandomTest extends Test {
	private final String inputFileName;
	private final String command;

	protected RandomTest(String command, String inputFileName) {
		super();
		this.inputFileName = inputFileName;
		inputFiles.add(inputFileName);
		this.command = command;
	}

	@Override
	public void run() {
        //eseguo il test
		try{
        int returnCode = Cmd_Linux.execute("bash", "-c", "/usr/lib/jvm/java-11-openjdk/bin/java -cp eseguibile.jar "
        		+ "it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.MainClass "
        		+ command + " testFiles/" + inputFileName + " &> testFiles/" + inputFileName.replace(".input", ".output"));
        if(returnCode == 0) {
			result = true;
			outputFiles.add(inputFileName.replace(".input", ".output"));
		}
		}catch(Exception ex) {
			comment = ex.getMessage();
		}
	}
}
