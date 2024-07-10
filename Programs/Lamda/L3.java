package Lamda;

// Define a functional interface
interface Calculator {
    int calculate(int a, int b);
}

public class L3 {
    public static void main(String[] args) {
        // Using a lambda expression to implement the calculate method of the functional interface
        Calculator add = (a,b) -> a + b;
        
        // Calling the calculate method using the lambda expression
        int result = add.calculate(10, 20);
        System.out.println("Result: " + result);  // Output: Result: 30
    }
}
