import java.util.*;

// code to understand different types of loops in java

public class Loops {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Example using while loop
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Example using do-while loop
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= num);
        System.out.println();

        // Example using for loop
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }
}
