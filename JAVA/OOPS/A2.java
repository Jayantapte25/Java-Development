//code to understand function overloading in OOPS - polymorphisms concept

//While overloading either the arguments of the function should be different, the number of arguments should be different or  the return type should be different.

public class A2 {
    public static void main(String[] args) {
        System.out.println("Sum of 2 numbers: " + add(2, 3));
        System.out.println("Sum of 3 numbers: " + add(2, 3, 4));
        System.out.println("Sum of 2 numbers: " + add(2.5, 3.5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
