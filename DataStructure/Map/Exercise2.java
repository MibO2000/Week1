package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
	public static void main(String[] args) {
		String example = "This is a great thing";
		String[] words = example.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for (String word:words) {
			Integer count = map.get(word);
			if (count == null) {
				count = 0;
			}
			map.put(word, count+1);
		}
		System.out.println(map);
 	}

}
