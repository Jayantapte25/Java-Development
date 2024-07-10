package Threads;

public class T7 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 running with priority: " + Thread.currentThread().getPriority());
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 running with priority: " + Thread.currentThread().getPriority());
        });

        // Set priorities for threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Maximum priority

        // Start threads
        thread1.start();
        thread2.start();
    }
}
