//extends Thread
//implements Runnable

package Week1.Thread;

class Task extends Thread{
	private int number;
	public Task(int number) {
		this.number=number;
	}
	public void run() {
		System.out.println("\nTask"+number+" Started");
		for(int i = number*100;i<=number*100+99;i++) {
			System.out.print(i+" ");
			}
		System.out.println("\nTask"+number+" Done");
	}
	
}

class Task1 extends Thread{
	public void run() {
		System.out.println("\nTask1 Started");
		for(int i = 100;i<=199;i++) {
			System.out.print(i+" ");
			}
		System.out.println("\nTask1 Done");
		}
}
class Task2 implements Runnable{
	public void run() {
		System.out.println("\nTask2 Started");
		for(int i = 200;i<=299;i++) {
			System.out.print(i+" ");
			}
		System.out.println("\nTask2 Done");
		}
}

public class ThreadBasicRunner {
	public static void main(String[] args) throws InterruptedException {
		//task1
		Task1 task1 = new Task1();
		System.out.println("Task1 Kicked off ");
		task1.start();
		task1.setPriority(1);

		//task2
		
		System.out.println("Task2 Kicked off ");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
		task2Thread.setPriority(10);
		//if CPU is running too much and you want to give it a rest if it wants to
		Thread.yield();
		

		//task3
		//but we want this to start after task 1 and 2
		task1.join();
		task2Thread.join();
		System.out.println("Task3 Kicked off ");

		for(int i = 300;i<=399;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask3 Done");	
		System.out.println("\nMain Done");


	}
}
