package Threads;
import java.util.concurrent.CountDownLatch;

public class T11 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping");
            System.out.println("");
            latch.countDown(); // Decrease the count
            System.out.println("Thread " + Thread.currentThread().getId() + " finished");
            System.out.println("");
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        latch.await();

        //The await() method on CountDownLatch blocks the calling thread until the count reaches zero. This ensures that the main thread waits for all worker threads to finish before proceeding.

        System.out.println("All threads have completed their tasks.");
    }
}
