package Testsuite.TestFolder;

import Testsuite.Cmd_Linux;
import Testsuite.Test;
import Testsuite.TestBuilder;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FolderTestBuilder extends TestBuilder {
    private static String[] actionsForJSONInput = {"1"};
    private static String[] actionsForGraamarInput = {"2", "3"};
    private String path;

    public FolderTestBuilder(String path) throws IOException, InterruptedException {
        this.path = path;
        Cmd_Linux.getProject();
    }

    @Override
    public List<Test> getTests() throws IOException, InterruptedException {
        List<Test> returnList = new LinkedList<>();
        File folder = new File(path);
        if(!folder.exists() || !folder.isDirectory())
            throw new IOException();

        for(File file : folder.listFiles()){
            if(!file.isFile())
                continue;

            if(file.getName().contains(".json"))
                for(String action : FolderTestBuilder.actionsForJSONInput)
                    returnList.add(new FolderTest(file.getPath(), action));

            if(file.getName().contains(".txt"))
                for(String action : FolderTestBuilder.actionsForGraamarInput)
                    returnList.add(new FolderTest(file.getPath(), action));

        }

        return returnList;
    }

    @Override
    public boolean shutdown() {
        return true;
    }
}
