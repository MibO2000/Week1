package Map;

import java.util.HashMap;
import java.util.Map;

public class Exercise {
	public static void main(String[] args) {
		String example = "This is a real thing";
		Map<Character,Integer> map = new HashMap<>();
		char[] characters = example.toCharArray();
		for (char character:characters) {
			Integer integer = map.get(character);
			if(integer == null) {
				map.put(character, 1);
			}
			else {
				map.put(character, integer+1);
			}
		}
		
		System.out.println(map);
	}
}
