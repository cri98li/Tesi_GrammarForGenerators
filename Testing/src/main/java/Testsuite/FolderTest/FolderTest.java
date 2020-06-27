package Testsuite.FolderTest;

import Testsuite.Cmd_Linux;
import Testsuite.Test;
import it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.Common.Utils;
import it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.FullAlgebra.Utils_FullAlgebra;
import it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.JSONSchema.JSONSchema;
import it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.JSONSchema.Utils_JSONSchema;

import java.io.FileWriter;
import java.io.Writer;


public class FolderTest extends Test {
    private String filename, action;
    private int command; //TODO: implementare controllo sul comando, per ora solo su JSON

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
            time = System.currentTimeMillis();

            JSONSchema js = Utils_JSONSchema.parse(filename);
            Writer w = new FileWriter(outputFileName);
            //w.write(Utils.beauty(js.toGrammarString()));
            w.write(Utils_FullAlgebra.parseString(Utils_JSONSchema.normalize(js).toGrammarString()).toGrammarString());
            w.close();
            result = true;
            outputFiles.add(outputFileName);

            time = System.currentTimeMillis() - time;
        }catch(Exception ex) {
            if(ex.getCause() != null)
                comment = ex.getCause().toString().replace(",", ".").replace("\r", "").replace("\n", "");
            else if(ex.getMessage() != null && !ex.getMessage().isEmpty())
                comment = ex.getMessage().replace(",", ".").replace("\r", "").replace("\n", "");
            else
                comment = "da indagare";

        }
    }
}
