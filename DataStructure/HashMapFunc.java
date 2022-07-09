package Week1.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapFunc {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Josh");
        map.put(2,"Lin Lin");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
