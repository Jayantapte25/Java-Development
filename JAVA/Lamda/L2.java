interface Printable {
    void print(int a);
}

//here we are using lamda expression to implement the interface Printable without creating a separate class & in main function we are creating an object of Printable interface using lamda expression.

public class L2 {
    public static void main(String[] args) {
        Printable obj = (a)->{
            System.out.println("Hello from Lamda!   " + a);
        };
        obj.print(6);
    }
}

