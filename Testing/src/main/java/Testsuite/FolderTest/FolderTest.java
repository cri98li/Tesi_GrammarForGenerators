package Testsuite.FolderTest;

import Testsuite.Cmd_Linux;
import Testsuite.Test;
import it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.Common.Utils;
import it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.FullAlgebra.Defs_Assertion;
import it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.FullAlgebra.Utils_FullAlgebra;
import it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.JSONSchema.JSONSchema;
import it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.JSONSchema.Utils_JSONSchema;
import it.unipi.di.tesiFalleniLandi.JsonSchema_to_Algebra.Witness.WitnessEnv;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.TimeoutException;


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
            System.out.println("TESTFILE: "+filename);
            System.out.flush();
            time = System.currentTimeMillis();
            Thread t = new Thread(new Runnable() {



                @Override
                public void run() {
                    result = true;
                    Writer w = null;
                    try {
                        w = new FileWriter(outputFileName);
                        JSONSchema js = Utils_JSONSchema.parse(filename);


                        //w.write(Utils.beauty(Utils_JSONSchema.normalize(js).toGrammarString()));
                        Defs_Assertion defs = Utils_FullAlgebra.parseString(Utils_JSONSchema.normalize(js).toGrammarString());
                        WitnessEnv env= defs.notElimination().toWitnessAlgebra();
                        env.variableNormalization_separation(env);
                        w.write(env.variableNormalization_expansion(env).DNF().getFullAlgebra().toGrammarString());
                        //w.write(defs./*notElimination().*/toGrammarString());
                    } catch (Exception ex) {
                        if(ex.getCause() != null)
                            comment = ex.getCause().toString().replace(",", ".").replace("\r", "").replace("\n", "");
                        else if(ex.getMessage() != null && !ex.getMessage().isEmpty())
                            comment = ex.getMessage().replace(",", ".").replace("\r", "").replace("\n", "");
                        else if(ex.toString() != null && !ex.toString().isEmpty())
                            comment = ex.toString().replace(",", ".").replace("\r", "").replace("\n", "");
                        else
                            comment = "da indagare";

                        try {
                            w.write("ex");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        result = false;
                    }
                    try {
                        w.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    outputFiles.add(outputFileName);
                }
            });




            t.start();
            while (t.isAlive())
                if(System.currentTimeMillis() - time > 1000*60*1){
                    t.interrupt();
                    t.stop();
                    throw new TimeoutException("Timeout file: "+filename);
                }


            time = System.currentTimeMillis() - time;




        }catch(Exception ex) {
            if(ex.getCause() != null)
                comment = ex.getCause().toString().replace(",", ".").replace("\r", "").replace("\n", "");
            else if(ex.getMessage() != null && !ex.getMessage().isEmpty())
                comment = ex.getMessage().replace(",", ".").replace("\r", "").replace("\n", "");
            else if(ex.toString() != null && !ex.toString().isEmpty())
                comment = ex.toString().replace(",", ".").replace("\r", "").replace("\n", "");
            else
                comment = "da indagare";


            result = false;
        }
    }
}
