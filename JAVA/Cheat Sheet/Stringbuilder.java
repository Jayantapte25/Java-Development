import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the document text
        System.out.println("Enter the text from the document");
        String documentText = sc.nextLine();

        // Read the string to be found
        System.out.println("Enter the string to be found in the data");
        String searchString = sc.nextLine().trim(); //here we are trimming the string to remove any leading or trailing spaces

        //trim() method is used to remove any leading or trailing spaces from the string

        // Check if the trimmed searchString is contained in the documentText
        if (documentText.contains(searchString)) { //contains() method is used to check if the string contains the specified sequence of characters
            System.out.println("String is found in the document");
        } else {
            System.out.println("String is not found in the document");
        }

        sc.close();
    }
}
