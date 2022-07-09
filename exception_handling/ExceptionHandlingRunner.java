package Week1.exception_handling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		method2();

	}

	private static void method2() {
		method1();
	}

	private static void method1() {
		String a = null;
		System.out.println(a.length());
	}

}
