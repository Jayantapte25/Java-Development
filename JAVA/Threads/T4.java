package Threads;

//both functions execute simultaneously
//first run gets executed & it waits for 2 seconds
//simlutaneously main thread waits for the task to complete
//once the task is completed, it prints "Task is completed!"
//if the task is not completed, it waits for the task to complete

class MyTask implements Runnable {
    private boolean isCompleted = false;

    public synchronized void completeTask() {
        isCompleted = true;
        notify(); // Notify waiting thread
    }

    public synchronized void waitForCompletion() throws InterruptedException {
        while (!isCompleted) {
            wait(); // Wait until task is completed
        }
        System.out.println("Task is completed!");
    }

    public void run() {
        try {
            Thread.sleep(2000); // Simulate task execution
            completeTask();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class T4 {
    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        Thread taskThread = new Thread(task);

        // Start task thread
        taskThread.start();

        // Main thread waits for task completion
        task.waitForCompletion();
    }
}
