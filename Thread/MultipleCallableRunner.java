package Week1.Thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.util.List.*;


public class MultipleCallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		List<CallableTask> tasks = of(new CallableTask("Mib O")
				,new CallableTask("Mo It"),new CallableTask("Satt"));

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		//Future<String> welcomeFuture = executorService.submit(new CallableTask("Mib O"));
		List<Future<String>> results = executorService.invokeAll(tasks);
		for(Future<String> result:results) {
			System.out.println(result.get());
		}
		executorService.shutdown();
		
	}
	
}
