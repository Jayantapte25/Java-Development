package Threads;

public class T8 {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                Thread.yield(); // Yield to other threads

                //Within the task, Thread.yield() is called to suggest that the current thread might be willing to yield the CPU to other threads.
                //This can potentially improve scheduling fairness, but its usage should be judicious due to its unpredictable behavior.
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        // Start threads
        thread1.start();
        thread2.start();
    }
}
