package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class D2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue);

        System.out.println("Queue contains 'Bob'? " + queue.contains("Bob"));

        System.out.println("Queue size: " + queue.size());

        System.out.println("Poll: " + queue.poll());

        System.out.println("Queue after poll: " + queue);

        Queue<String> otherQueue = new LinkedList<>();
        otherQueue.offer("David");
        otherQueue.offer("Emma");
        queue.addAll(otherQueue);
        System.out.println("Queue after adding all from another queue: " + queue);
        
        String elementToRemove = "Bob";
        while (queue.contains(elementToRemove)) {
            queue.remove(elementToRemove);
        }

        System.out.println("Queue after removal: " + queue);
    }
}
