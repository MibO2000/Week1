package Week1.DataStructure.Generics;

import java.util.ArrayList;
import java.util.List;

public class Experiment {

		static <X extends List> void duplicate(X list) {
			list.addAll(list);
		}
	
		//upper bounded wildcard
		static <X extends Number> X doubleValue(X value) {
			return value;
		}
		
		//lower bounded wildcard
		static void addACoupleOfValues(List<? super Number> numbers) {
			numbers.add(1);
			numbers.add(1.0);
			numbers.add(1.4f);
			numbers.add(1l);
		}
		
		//generic
		static double sumOfNumberList(List<? extends Number> numbers) {
			double sum = 0.0;
			for (Number number:numbers) {
				sum += number.doubleValue();
			}
			return sum;
		}
		public static void main(String[] args) {
			System.out.println(sumOfNumberList(List.of(1,1,2,3,3,4,9)));
			
			List mtList = new ArrayList<Number>();
			addACoupleOfValues(mtList);
			System.out.println(mtList);
			duplicate(mtList);
			System.out.println(mtList);
		}
}
