package Week1.DataStructure.Generics;

import java.util.ArrayList;
import java.util.List;

public class Runner2 {

//	Error
//	static <X extends List> void duplicate(X list) {
//		list.addAll(list);
//	}
	static <X extends Number> X doubleValue(X value) {
		
		return value;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
		//duplicate(numbers);
		System.out.println();
		int  x = 10;
		System.out.println(doubleValue(x));
		Restricted<Integer> list = new Restricted();
		list.add(25);
		list.add(11);
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list);
	}

}
