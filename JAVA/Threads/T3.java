package Threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//BlockingQueue<Integer> in this code is a special type of queue designed for use in multithreaded environments. It combines the concept of a queue (First-In-First-Out data structure) with features for thread safety and flow control.

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                queue.put(i); // Produce an item
                System.out.println("Produced: " + i);
                Thread.sleep(500); //we use sleep to force the producer to wait for the consumer to consume the item.
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//The producer thread repeatedly attempts to add items (integers) to the queue using the queue.put(i) method.If the queue is full, the producer thread gets blocked until a consumer removes an item, making space available.

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int num = queue.take(); // Consume an item
                System.out.println("Consumed: " + num);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//The consumer thread repeatedly attempts to remove items (integers) from the queue using the queue.take() method. If the queue is empty, the consumer thread gets blocked until a producer adds an item.

public class T3 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        // Create producer and consumer threads
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        // Start threads
        producerThread.start();
        consumerThread.start();
    }
}

