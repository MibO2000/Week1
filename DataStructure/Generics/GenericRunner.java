package Week1.DataStructure.Generics;

public class GenericRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.add("Josh");
		list.add("Kate");
		System.out.println(list);
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.add(25);
		list2.add(11);
		System.out.println(list2);
		System.out.println(list.get(1));
	}

}
