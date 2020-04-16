import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class MainClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		//ARGS: #testTipo1 #testTipo2 #testTipo3 ...
		List<Integer> testId = new LinkedList<>();

			for(int i = 0; i < args.length; i++)
				testId.add(Integer.parseInt(args[i]));
		
		
		
		
		
		TestBuilder testBuilder = TestBuilder.setup(testId);
		ExecutorService executors = Executors.newFixedThreadPool(12);
		
		List<Test> tests = testBuilder.getTests();
		for(Test test : tests)
			executors.execute(test);
		
		executors.shutdown();
		
		while(!executors.awaitTermination(1, TimeUnit.SECONDS)) {
			//System.out.println("MANCANO"+ executors. +"TEST");
		}
		testBuilder.shutdown();
	}
}
