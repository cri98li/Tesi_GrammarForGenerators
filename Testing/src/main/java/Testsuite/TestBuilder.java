package Testsuite;

import java.io.IOException;
import java.util.List;

public abstract class TestBuilder {
    public abstract List<Test> getTests() throws IOException, InterruptedException;

    public abstract boolean shutdown();
}
