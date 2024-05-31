package Threads;

class jayant extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i);
        }
    }
}

class resh extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i*i);
        }
    }
}

public class T12 {
    public static void main(String[] args) {

        jayant j = new jayant();
        resh r = new resh();
        j.start();
        try {
            j.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.start();
        System.out.println("***");
            
    }
}
