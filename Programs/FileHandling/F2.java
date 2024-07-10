package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

//code to write content to a file

public class F2 {
    public static void main(String[] args) {
        String content = "Hello, world!"; // Content to write to file
        try {
            FileOutputStream fos = new FileOutputStream("File Handling.txt");
            fos.write(content.getBytes()); //getBytes() converts string to bytes & writes to file
            fos.close();
            System.out.println("Content written to file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
