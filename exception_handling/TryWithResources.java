package exception_handling;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		
		//in this way, there is no need to write catch or finally and no need to close scanner
		try (Scanner scanner = new Scanner(System.in);){
			int[] i = {1,2,3};
			int number = i[3];
		}
		
		/*try{
		 * code
		 * }catch(IOException | SQLException ex){
		 * 		ex.printStrackTrace();
		 * }
		 */

	}

}
