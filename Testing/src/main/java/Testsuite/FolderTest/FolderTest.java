package Testsuite.FolderTest;

import Testsuite.Cmd_Linux;
import Testsuite.Test;

public class FolderTest extends Test {
    private String filename, action;
    private int command;

    public FolderTest(String filename, int command, String action){
        super();
        this.filename = filename;
        this.command = command;
        this.action = action;

        inputFiles.add(filename);
    }

    @Override
    public void run() {
        String outputFileName = filename.replace(".json", "").replace(".algebra", "") +"_" + action;
        try{
            int returnCode = Cmd_Linux.execute("bash", "-c", "/usr/lib/jvm/java-11-openjdk/bin/java -cp eseguibile.jar "
                    + "it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.MainClass "
                    + command + " " + filename + " &> " + outputFileName);
            if(returnCode == 0) {
                result = true;
                outputFiles.add(outputFileName);
            }
        }catch(Exception ex) {
            comment = ex.getMessage();
        }
    }
}
