package Testsuite;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class Test implements Runnable {
    protected boolean result;
    protected String comment;
    protected List<String> inputFiles;
    protected List<String> outputFiles;

    protected Test(){
        result = false;
        comment = "";
        inputFiles = new LinkedList<>();
        outputFiles = new LinkedList<>();
    }

    public boolean getResult(){
        return result;
    }

    public String getComment(){
        return comment;
    }

    public List<String> getInputFiles(){
        return inputFiles;
    }

    public List<String> getOutputFiles(){
        return outputFiles;
    }


}
