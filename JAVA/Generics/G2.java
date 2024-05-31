package Generics;

public class G2 {
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    //doubleValue() is a method of Number class which converts the value of the number object to double.

    public static void main(String[] args) {
        double result = G2.sum(10.5, 20); // Call the sum method from G2 class
        System.out.println("Sum: " + result);
    }
}
