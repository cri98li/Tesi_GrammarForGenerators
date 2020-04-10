package com.poortoys.examples;

import java.io.IOException;

public class AppMain {

    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        
        //genero parser e lexer
        processBuilder.command("bash", "-c", "grammarinator-process Algebra.g4 -o tmp/ --no-actions");
        Process process = processBuilder.start();
        System.out.println("returncode creazione parser: "+process.waitFor());
        
        
        
        
        //genero il file di test
        processBuilder.command("bash", "-c", "grammarinator-generate -r rootDef_assertion -d 100 -o tmp/test.txt -p tmp/AlgebraUnparser.py -l tmp/AlgebraUnlexer.py -n 10");
        process = processBuilder.start();
        System.out.println("returncode creazione testfile: "+ process.waitFor());
        
        
        //eseguo il test
        String command = "2";
        processBuilder.command("bash", "-c", "java -jar JsonSchema_to_Algebra-0.0.1-SNAPSHOT-jar-with-dependencies.jar " + command + " test.txt > output.txt");
        process = processBuilder.start();
        System.out.println("returncode eseguibile: "+process.waitFor());
    }

}
