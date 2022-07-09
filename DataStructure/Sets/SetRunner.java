package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class SetRunner {
	public static void main(String[] args) {
		List<Character> list = List.of('Z','B','Z','A','C');
		Set<Character> treeSet = new TreeSet<>(list);
		Set<Character> linkedHashSet = new LinkedHashSet<>(list);
		Set<Character> hashSet = new HashSet<>(list);
		System.out.println(treeSet);
		System.out.println(linkedHashSet);
		System.out.println(hashSet);
		List<Integer> list1 = List.of(7,5,6,6,1,2,2,5,5,7);
		Set<Integer> treeSet1 = new TreeSet<>(list1);
		Set<Integer> linkedHashSet1 = new LinkedHashSet<>(list1);
		Set<Integer> hashSet1 = new HashSet<>(list1);
		System.out.println(treeSet1);
		System.out.println(linkedHashSet1);
		System.out.println(hashSet1);

	}
}
