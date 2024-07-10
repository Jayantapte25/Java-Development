package DSA;

import java.util.HashMap;
import java.util.Map;

public class D6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 15);

        System.out.println("Map: " + map);

        System.out.println("Value for 'Banana': " + map.get("Banana"));

        System.out.println("Contains key 'Orange'? " + map.containsKey("Orange"));

        map.remove("Apple");
        System.out.println("Map after removal: " + map);
    }
}
