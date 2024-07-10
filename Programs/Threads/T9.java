package Threads;

public class T9 {
    public static void main(String[] args) throws InterruptedException {
        Thread workerThread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Worker thread is running...");
                    Thread.sleep(1000); // Simulate work
                }
            } catch (InterruptedException e) {
                System.out.println("Worker thread interrupted. Cleaning up...");
                // Clean up resources, if needed
            }
        });

        workerThread.start();

        // Let the worker thread run for 5 seconds
        Thread.sleep(5000);

        //After 5 seconds, the main thread calls workerThread.interrupt(). This sets the interrupt flag for the workerThread.

        // Interrupt the worker thread
        workerThread.interrupt();

        //The line workerThread.interrupt() sets an interrupt flag for the workerThread. This flag is a mechanism to signal to the thread that it should stop its current operation. The thread can check this flag periodically and stop its operation gracefully.

        workerThread.join(); // Wait for the worker thread to terminate gracefully

        //The join() method in the main thread finishes waiting, and the main thread continues executing. The main thread prints a message indicating that the worker thread has terminated.

        System.out.println("Worker thread terminated.");
    }
}
