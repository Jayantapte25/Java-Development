import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] predefinedNumbers = {1, 2, 3, 4, 5};
        
        numbers[0] = 10;
        int firstNumber = predefinedNumbers[0];
        
        int length = numbers.length;
        
        System.out.println("Using a for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        System.out.println("Using an enhanced for loop:");
        for (int num : predefinedNumbers) {
            System.out.println("predefinedNumber = " + num);
        }
        
        System.out.println("Using a while loop:");
        int i = 0;
        while (i < numbers.length) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
            i++;
        }
        
        int[] values = new int[5];
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        while (index < values.length) {
            System.out.println("Enter value for index " + index + ": ");
            values[index] = scanner.nextInt();
            index++;
        }
        
        try {
            int invalidAccess = numbers[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        System.out.println("2D Array (matrix):");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        int[] seats = new int[100];
        System.out.println("Enter the number of seats to be booked:");
        int numSeats = scanner.nextInt();
        
        try {
            for (int j = 0; j < numSeats; j++) {
                System.out.println("Enter the seat number " + (j + 1));
                int seatNumber = scanner.nextInt();
                if (seatNumber < 0 || seatNumber >= seats.length) {
                    throw new ArrayIndexOutOfBoundsException(seatNumber);
                }
                seats[j] = seatNumber;
            }
            
            System.out.println("The seats booked are:");
            for (int j = 0; j < numSeats; j++) {
                System.out.println(seats[j]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
