package DSA;

import java.util.Collections;
import java.util.LinkedList;

public class D3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(89);
        linkedList.add(1);
        linkedList.add(3);

        System.out.println("LinkedList: " + linkedList);

        System.out.println("Element at index 1: " + linkedList.get(1));
        linkedList.set(1, 25);
        System.out.println("Updated LinkedList: " + linkedList);

        linkedList.remove(2);
        System.out.println("LinkedList after removal: " + linkedList);

        Collections.sort(linkedList); // Sorts the LinkedList in ascending order
        System.out.println("Sorted LinkedList: " + linkedList); 
    }
}
