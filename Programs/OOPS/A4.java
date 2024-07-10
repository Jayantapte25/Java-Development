import Bank.MathOperations;

public class A4 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = MathOperations.add(num1, num2);
        int product = MathOperations.multiply(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
