package Week1.Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceRunner {
	
	public static void main(String[] args) {
		ExecutorService executorSercive = Executors.newSingleThreadExecutor();
		executorSercive.execute(new Task1());
		executorSercive.execute(new Thread(new Task2()));
		executorSercive.shutdown();
		System.out.println("Task3 Kicked off ");

		for(int i = 300;i<=399;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask3 Done");	
		System.out.println("\nMain Done");

		
	}
}
