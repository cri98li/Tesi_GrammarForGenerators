import java.io.IOException;
import java.util.concurrent.*;

public class MainClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		TestBuilder testBuilder = TestBuilder.setup();
		ExecutorService executors = Executors.newCachedThreadPool();
		
		
		for(int i = 0; i < 100; i++)
			executors.execute(testBuilder.getTest());
		
		executors.shutdown();
		
		while(!executors.awaitTermination(1, TimeUnit.SECONDS));
		testBuilder.shutdown();
	}
}
