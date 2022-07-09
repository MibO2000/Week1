package exception_handling;

import java.util.Scanner;

public class FinallyRunner {
	public static void main(String[] args) {
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int[] i = {1,2,3};
			int number = i[3];
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(scanner != null) {
				scanner.close();
				System.out.println("Scanner is closed");
			}
		}
		System.out.println("Scanner just closed");
	}
}
