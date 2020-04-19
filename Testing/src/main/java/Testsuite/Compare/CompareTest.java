package Testsuite.Compare;

import Testsuite.Compare.Algebra.ANTLR4.AlgebraParser;
import Testsuite.Compare.Algebra.ANTLR4.GrammaticaLexer;
import Testsuite.Compare.Algebra.ANTLR4.GrammaticaParser;
import Testsuite.Compare.Algebra.Assertion;
import Testsuite.Test;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.Set;

public class CompareTest extends Test {
    public CompareTest(String file1, String file2){
        super();
        inputFiles.add(file1);
        inputFiles.add(file2);
    }

    @Override
    public void run() {
        result = compare(inputFiles.get(0), inputFiles.get(1));
    }

    private boolean compare(String pathFile1, String pathFile2){
        try{
            JSONObject root1, root2;
            JSONParser jsonParser = new JSONParser();
            FileReader reader = new FileReader(pathFile1);
            root1 = (JSONObject) jsonParser.parse(reader);

            reader = new FileReader(pathFile2);
            root2 = (JSONObject) jsonParser.parse(reader);

            return root1.equals(root2);
        } catch (Exception e) {
            //comment = e.getMessage();
        }

        try {
            Assertion schema1, schema2;
            Reader reader = new FileReader(pathFile1);
            GrammaticaLexer lexer = new GrammaticaLexer(CharStreams.fromReader(reader));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammaticaParser parser = new GrammaticaParser(tokens);

            ParseTree tree =  parser.assertion();
            AlgebraParser p = new AlgebraParser();
            schema1 = (Assertion) p.visit(tree);



            reader = new FileReader(pathFile2);
            lexer = new GrammaticaLexer(CharStreams.fromReader(reader));
            tokens = new CommonTokenStream(lexer);
            parser = new GrammaticaParser(tokens);

            tree =  parser.assertion();
            p = new AlgebraParser();
            schema2 = (Assertion) p.visit(tree);

            return schema1.equals(schema2);
        } catch (Exception e) {
            //comment = e.getMessage();
        }


        return false;
    }

    static class CompareJSON{
        JSONObject root1, root2;

        public CompareJSON(String pathFile1, String pathFile2) throws IOException, ParseException {
            JSONParser jsonParser = new JSONParser();
            FileReader reader = new FileReader(pathFile1);
            root1 = (JSONObject) jsonParser.parse(reader);

            reader = new FileReader(pathFile2);
            root2 = (JSONObject) jsonParser.parse(reader);

            System.out.println(root1.equals(root2));
        }

        public boolean compare(){
            return compare(root1, root2);
        }

        private boolean compare(Object obj1, Object obj2){
            return obj1.equals(obj2);
        }

        private boolean compare(JSONObject obj1, JSONObject obj2){
            if(obj1.size() != obj2.size()) return false;

            Set<Map.Entry<String, ?>> entrySet = obj1.entrySet();
            for(Map.Entry<String, ?> entry : entrySet){
                Object toCompare = obj2.get(entry.getKey());
                if(toCompare == null) return false;
                if(!compare(entry.getValue(), toCompare)) return false;
            }

            return true;
        }

        private boolean compare(JSONArray array1, JSONArray array2){
            if(array1.size() != array2.size()) return false;
            for(int i = 0; i < array1.size(); i++)
                if(!compare(array1.get(i), array2.get(i)))
                    return false;

            return true;
        }
    }
}
