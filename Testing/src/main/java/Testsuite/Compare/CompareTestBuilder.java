package Testsuite.Compare;

import Testsuite.Test;
import Testsuite.TestBuilder;

import java.io.IOException;
import java.util.*;

public class CompareTestBuilder extends TestBuilder {
    private TreeMap<String, String> filenames;

    public CompareTestBuilder(TreeMap<String, String> filenames) {
        this.filenames = filenames; //contiene le coppie file1, file2
    }

    @Override
    public List<Test> getTests() throws IOException, InterruptedException {
        List<Test> returnList = new LinkedList<>();

        for(Map.Entry<String, String> entry : filenames.entrySet())
            returnList.add(new CompareTest(entry.getKey(), entry.getValue()));

        return returnList;
    }

    @Override
    public boolean shutdown() {
        return true;
    }
}