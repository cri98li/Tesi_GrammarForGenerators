import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class MainClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		//ARGS: #test {lista possibili test}
		int nTest = 100;
		List<String> testId = new LinkedList<>();
		testId.add("1"); //json --> grammatica
		testId.add("2"); //grammatica --> json
		testId.add("3"); //not elimination
		
		if(args.length != 0) {
			nTest = Integer.parseInt(args[0]);
			testId = new LinkedList<>();
			
			for(int i = 1; i < args.length; i++)
				testId.add(args[i]);
		}
		
		
		
		
		
		
		TestBuilder testBuilder = TestBuilder.setup(testId);
		ExecutorService executors = Executors.newFixedThreadPool(12);
		
		
		for(int i = 0; i < nTest; i++)
			executors.execute(testBuilder.getTest());
		
		executors.shutdown();
		
		while(!executors.awaitTermination(1, TimeUnit.SECONDS)) {
			//System.out.println("MANCANO"+ executors. +"TEST");
		}
		testBuilder.shutdown();
	}
}
