package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//code to read content from a file

public class F3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("File Handling.txt"))) {
            String line; // Variable to store each line of file
            while ((line = br.readLine()) != null) { // Read each line of file & reads in buffer until null
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
