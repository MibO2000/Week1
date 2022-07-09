package Week1.exception_handling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method2();
		System.out.println("Main over");


	}

	private static void method2() {
		method1();
		System.out.println("Method2 over");

	}

	private static void method1() {
		try {
			//String a = null;
			//a.length();
			int[] i = {1,2};
			int b = i[3];
			System.out.println("Method1 over");
		}catch(NullPointerException ex) {
			System.out.println("NullPointerException");
			ex.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
			ex.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Error in Method1");
		}
	}

}
