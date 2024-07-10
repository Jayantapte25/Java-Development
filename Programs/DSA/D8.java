package DSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class D8 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Apple");
        deque.addLast("Orange");
        deque.addFirst("Banana");

        System.out.println("Deque: " + deque);

        System.out.println("Removed from first: " + deque.removeFirst());
        System.out.println("Deque after removal: " + deque);
    }
}
