package Testsuite.TestFolder;

import Testsuite.Cmd_Linux;
import Testsuite.Test;

public class FolderTest extends Test {
    private String filename, command;

    public FolderTest(String filename, String command){
        super();
        this.filename = filename;
        this.command = command;

        inputFiles.add(filename);
    }

    @Override
    public void run() {
        try{
            int returnCode = Cmd_Linux.execute("bash", "-c", "/usr/lib/jvm/java-11-openjdk/bin/java -cp eseguibile.jar "
                    + "it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.MainClass "
                    + command + " " + filename + " &> " + filename+"_"+command+".output");
            if(returnCode == 0) {
                result = true;
                outputFiles.add(filename+"_"+command+".output");
            }
        }catch(Exception ex) {
            comment = ex.getMessage();
        }
    }
}
