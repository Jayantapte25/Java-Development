package DSA;

import java.util.ArrayList;

public class D4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("ArrayList: " + arrayList);

        arrayList.add(1, "Pineapple"); // Adds "Pineapple" at index 1 & shifts the rest
        System.out.println("ArrayList: " + arrayList);

        arrayList.set(2, "Mango"); // Replaces the element at index 2
        System.out.println("Updated ArrayList: " + arrayList);

        System.out.println("Contains 'Banana'? " + arrayList.contains("Banana"));

        arrayList.remove("Banana");
        System.out.println("ArrayList after removal: " + arrayList);

        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("Grapes");
        anotherList.add("Mango");
        arrayList.addAll(anotherList);
        System.out.println("ArrayList after adding all from another list: " + arrayList);
    }
}
