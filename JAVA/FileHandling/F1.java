package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

//code to create a file

public class F1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Jayant.txt");
            // File created successfully
            System.out.println("File created successfully!");
            fos.close(); // Don't forget to close the stream
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
