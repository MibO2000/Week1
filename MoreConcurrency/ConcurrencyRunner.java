package MoreConcurrency;

public class ConcurrencyRunner {
	public static void main(String[] args) {
		BiCounter counter = new BiCounter();
		counter.incrementI();
		counter.incrementJ();
		counter.incrementI();
		System.out.println(counter.getI());
	}
}
