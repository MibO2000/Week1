package Week1.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapHandling {
    public static void main(String[] args) {
        HashMap<Integer,String > map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        System.out.println(map.entrySet());
        System.out.println(map);
    }
}
