//code to understand input in java

import java.util.*;

public class TakingInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); //this will take value with space

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter the full name: ");
        sc.nextLine();
        String fullname = sc.nextLine(); //this will take value with space

        System.out.println("Enter the full name: ");
        String fullNaam = sc.next(); // Reads until the next whitespace

        System.out.println("Your name is " + name + ", you are " + age + " years old and you earn " + salary + " dollars.");

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of a and b is: " + (a+b));

        sc.close();
    }
}
