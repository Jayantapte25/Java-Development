package Threads;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

// Example using Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class T1 {
    public static void main(String[] args) {
        // Creating threads using Thread class
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Creating threads using Runnable interface
        Thread runnableThread1 = new Thread(new MyRunnable());
        Thread runnableThread2 = new Thread(new MyRunnable());

        // Start threads
        thread1.start();
        thread2.start();
        runnableThread1.start();
        runnableThread2.start();
    }
}
