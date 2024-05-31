package FileHandling;
import java.io.File;

//code to delete a file

public class F5 {
    public static void main(String[] args) {
        File file = new File("jayant.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully!");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
