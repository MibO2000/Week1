package MoreConcurrency;

import java.util.ArrayList;
//import java.util.Hashtable;
//import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
	public static void main(String[] args) {
		String str = "ABC ABCDE ABCD";
		//Map<Character, LongAdder> occurances = new Hashtable();
		
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap();
		
		for (char character:str.toCharArray()) {
			
			occurances.computeIfAbsent(character, chr -> new LongAdder()).increment();
			
			/*
			*LongAdder longAdder = occurances.get(character);
			*if (longAdder == null) {
			*	longAdder = new LongAdder();
			*}
			*longAdder.increment();
			*occurances.put(character,longAdder);
			*/
		}
		System.out.println(occurances);
		ArrayList<String> z = new ArrayList<>();
	}
}
