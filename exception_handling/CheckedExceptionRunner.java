package exception_handling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		
		try {
			someOtherMethod();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//someOtherMethod(); this is error
		someOtherMethod2();
		
	}

	private static void someOtherMethod2() throws RuntimeException {
	
	}
	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
		
	}

}
