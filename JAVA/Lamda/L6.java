public class L6 {
    public static void main(String[] args) {
        ///here we are using lambda expression to create a thread & the lambda expression is passed to the Thread constructor.
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task execution: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Creating a thread with the lambda Runnable
        Thread thread = new Thread(task);
        thread.start();
    }
}
