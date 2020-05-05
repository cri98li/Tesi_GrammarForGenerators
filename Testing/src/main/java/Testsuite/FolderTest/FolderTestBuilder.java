package Testsuite.FolderTest;

import Testsuite.Cmd_Linux;
import Testsuite.Test;
import Testsuite.TestBuilder;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FolderTestBuilder extends TestBuilder {
    private static int[] actionsForJSONInput = {1};
    private static int[] actionsForGramarInput = {2, 3, 4};
    private static String[] actionNames ={"toAlgebra.algebra", "toJSONSchema.json", "notElimination.algebra", "andMerging.algebra"};

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
            if(!file.isFile() || file.getName().startsWith("output"))
                continue;

            if(file.getName().contains(".json"))
                for(int action : FolderTestBuilder.actionsForJSONInput)
                    if(new File(file.getPath().replace("input", "output").replace(".json", "_"+actionNames[action-1])).exists())
                        returnList.add(new FolderTest(file.getPath(), action, actionNames[action-1]));

            if(file.getName().contains(".algebra"))
                for(int action : FolderTestBuilder.actionsForGramarInput)
                    if(new File(file.getPath().replace("input", "output").replace(".algebra", "_"+actionNames[action-1])).exists())
                        returnList.add(new FolderTest(file.getPath(), action, actionNames[action-1]));

        }

        return returnList;
    }

    @Override
    public boolean shutdown() {
        return true;
    }
}
