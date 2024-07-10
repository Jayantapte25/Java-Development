// code to understand basic input and output in java

public class Cheatsheet
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        // Formatting output using println
        System.out.println("This is a new line.");  // Print with a new line
        System.out.print("This is ");                // Print without a new line
        System.out.println("on the same line.");    // Print on the same line

        // Print variables and expressions
        int x = 10;
        double pi = 3.14159;
        String name = "John";
        System.out.println("The value of x is: " + x);
        System.out.println("The value of pi is: " + pi);
        System.out.println("Hello, " + name + "!");

        // Print special characters
        System.out.println("Backslash: \\");
        System.out.println("Tab:\tTabbed text");
        System.out.println("Newline:\nNext line");

        System.out.println("");

        // Formatting numbers
        double num = 123.456789;
        System.out.printf("Formatted number: %.2f\n", num);  // Print formatted number with 2 decimal places

        // Printing boolean values
        boolean flag = true;
        System.out.println("Boolean value: " + flag);

        // Printing array elements
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array elements: " + java.util.Arrays.toString(array));

        // Using printf for formatted output
        int num1 = 10;
        double num2 = 20.5;
        System.out.printf("Formatted output: num1 = %d, num2 = %.2f\n", num1, num2);

        System.out.println("");

        // Concatenation and formatting
        int age = 30;
        String nime = "Alice";
        System.out.println("Name: " + nime + ", Age: " + age);

        // Outputting multiple lines
        System.out.println("First line\nSecond line\nThird line");

        // Printing special characters and escape sequences
        System.out.println("Backslash: \\");
        System.out.println("Single quote: \'");
        System.out.println("Double quote: \"");

        System.out.println("");

        // Using printf for formatted strings
        String productName = "Laptop";
        int quantity = 2;
        double unitPrice = 899.99;
        System.out.printf("Order: %d %s(s) at $%.2f each\n", quantity, productName, unitPrice);

        // Handling exceptions and stack traces
        try {
            int result = 10 / 0;  // This will throw an ArithmeticException
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            e.printStackTrace();  // Print stack trace
        }
    }
}