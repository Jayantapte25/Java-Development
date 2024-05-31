package Threads;

public class T5 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();

        // Check if the thread is alive
        if (thread.isAlive()) {
            System.out.println("Thread is still active.");
        } else {
            System.out.println("Thread has completed its work.");
        }
    }
}
