package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// User class definition
class User {
    private String name;
    private String mobileNumber;
    private String username;
    private String password;

    // Parameterized constructor
    public User(String name, String mobileNumber, String username, String password) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class UserBO {
    public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws IOException {
        for (User user : userList) { 
            String userDetails = user.getName() + "," + user.getMobileNumber() + "," +
                                 user.getUsername() + "," + user.getPassword();
            bw.write(userDetails); //bw.write() is used to write the data in the file
            bw.newLine();
        }
        bw.flush();//bw.flugh() is used to clear the buffer
    }
}

// Main class definition
public class F6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();

        System.out.println("Enter the number of users:");
        int numberOfUsers = Integer.parseInt(scanner.nextLine());

        //writing the user details to the file
        for (int i = 1; i <= numberOfUsers; i++) {
            System.out.println("Enter the details of user :" + i);
            String userDetails = scanner.nextLine();
            String[] details = userDetails.split(",");
            User user = new User(details[0], details[1], details[2], details[3]);
            userList.add(user);
        }

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("output.csv"));
            UserBO.writeFile(userList, bw);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //reading the user details from the file
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("output.csv"));
            String line;
            System.out.println("Contents of output.csv:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
