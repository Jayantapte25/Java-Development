package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//code to read content from a file & print it

public class F4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("File Handling.txt"))) {
            while (sc.hasNextLine()) { //HasNextLine() returns true if there is another line in the input of this scanner
                String line = sc.nextLine(); //nextLine() reads the next line from the file
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
