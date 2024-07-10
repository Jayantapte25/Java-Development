package Threads;

class Counter {
    private int count = 0;

    // Synchronized method to increment count safely
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get current count
    public synchronized int getCount() {
        return count;
    }
}

public class T2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create multiple threads to increment counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> { //-> is lambda expression in java which is used to define the body of the function.
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start threads
        thread1.start();
        thread2.start();

        // Wait for threads to complete
        thread1.join();
        thread2.join();

        // Print final count
        System.out.println("Counter value: " + counter.getCount()); //getcount() is a method of Counter class which returns the value of count.
    }
}

//synchronized: As discussed earlier, this ensures only one thread can execute this method at a time.

// throws InterruptedException: This indicates that the join() method might throw an InterruptedException, which needs to be handled (here, we simply ignore it for simplicity).

// Counter counter = new Counter();: This creates a new instance of the Counter class and assigns it to the counter variable.

// thread1: This thread repeatedly calls counter.increment() 1000 times, effectively incrementing the count in the Counter object.

// thread1.join(): This suspends the execution of the main thread (main) until thread1 finishes.

// thread2.join(): This suspends the main thread until thread2 finishes.

//When you call join() on a thread, the current thread (the one calling join()) pauses its execution until the target thread (the one you called join() on) finishes running.

//In this case, the main thread waits for both thread1 and thread2 to complete before continuing. This ensures the final count is printed only after both threads have finished incrementing.