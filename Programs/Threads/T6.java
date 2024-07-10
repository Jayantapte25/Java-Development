package Threads;

public class T6 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running...");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 is done.");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 is done.");
        });

        thread1.start();
        thread2.start();

        // Wait for thread1 to finish before proceeding
        thread1.join();

        //join() method in Java is a useful method for waiting for a thread to finish execution before the main thread continues. This functionality is especially useful when you need the result of a thread's execution before proceeding further in your main program.

        //The join() method is called on thread1. This causes the main thread to wait (block) until thread1 finishes its execution. In this scenario, the main thread will wait for 2 seconds (because thread1 sleeps for 2 seconds) before proceeding.

        System.out.println("Main thread continues after thread1 is done.");
    }
}
