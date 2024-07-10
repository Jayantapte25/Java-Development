import java.util.Scanner;

public class ternaryop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the numbers
        System.out.println("Enter the numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        // Using the ternary operator to find the greatest number
        int greatest = (num1 > num2) 
                        ? (num1 > num3 ? num1 : num3) 
                        : (num2 > num3 ? num2 : num3);
        
        // Printing the greatest number
        System.out.println(greatest + " is the greatest number");
    }
}
