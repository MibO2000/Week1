package Week1.DataStructure.Generics;

import java.util.ArrayList;

public class Restricted<T extends Number> {
	ArrayList<T> list = new ArrayList<>();
	public void add(T element) { list.add(element);}
	public void remove (T element) { list.remove(element);}
	
	public T get(int number) { return list.get(number);}
	
	public String toString() { return list.toString();}
}
