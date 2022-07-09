package Week1.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMultiple {
	public static void main(String[] args) {
		ExecutorService executorSercive = Executors.newFixedThreadPool(2);
		executorSercive.execute(new Task(1));
		executorSercive.execute(new Task(2));
		executorSercive.execute(new Task(3));
		executorSercive.execute(new Task(4));
		executorSercive.execute(new Task(5));
		executorSercive.shutdown();
	}
}
