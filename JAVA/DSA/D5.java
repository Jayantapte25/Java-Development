package DSA;

import java.util.HashSet;
import java.util.Set;

public class D5 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Set: " + set);

        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        set.remove("Orange");
        System.out.println("Set after removal: " + set);
    }
}
