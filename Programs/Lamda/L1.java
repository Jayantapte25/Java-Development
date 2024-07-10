package Lamda;

interface Greeting {
    void greet();
}

//Code to explain the use of anonymous class where we are implementing the interface Greeting without creating a separate class & in main function we are creating an object of Greeting interface using anonymous class.

public class L1 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class!");
            }
        };
        greeting.greet();
    }
}
