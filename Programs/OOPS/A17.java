import java.util.Scanner;

class WeakPasswordException extends Exception { //WeakPasswordException is a checked exception
    public WeakPasswordException(String message) { //constructor of WeakPasswordException
        super(message); //calls the constructor of Exception
    }
}

class User {
    private String name;
    private String mobile;
    private String username;
    private String password;

    public User() {}

    public User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\n" +
               "Mobile:" + mobile + "\n" +
               "Username:" + username + "\n" +
               "Password:" + password;
    }
}

class UserBO {
    public static void validate(User u) throws WeakPasswordException { //it's important to write throws WeakPasswordException as it is a checked exception
        String password = u.getPassword();
        
        if (password.length() < 10 || password.length() > 20) { //.lenght or .size() is used to get the length of the string
            throw new WeakPasswordException("Your password is weak"); //calls the constructor of WeakPasswordException
        } 
        
        boolean hasDigit = false; //initially setting all the flags to false
        boolean hasSpecialChar = false;
        boolean hasLetter = false;
        
        for (char ch : password.toCharArray()) { //converts the string into a character array
            if (Character.isDigit(ch)) { //Character here is a inbuild java class which has a function isDigit which checks whether the character is a digit or not
                hasDigit = true;
            } else if (Character.isLetter(ch)) {
                hasLetter = true;
            } else {
                hasSpecialChar = true;
            }
        }
        
        if (!hasDigit || !hasSpecialChar || !hasLetter) { //if any of the flags is false then the password is weak
            throw new WeakPasswordException("Your password is weak");
        }
    }
}

public class A17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the user details");
        String input = scanner.nextLine();
        String[] details = input.split(",");
        
        String name = details[0];
        String mobile = details[1];
        String username = details[2];
        String password = details[3];
        
        User user = new User(name, mobile, username, password);
        
        try {
            UserBO.validate(user);
            //Here no need to create instance of UserBO as the method validate is a static method
            //also no need to catch the WeakPasswordException as it is a checked exception
            //we are sending user object which has all the details of the user

            System.out.println(user); 
            //if the password is strong then the user object will be printed
            //this calls the toString method of the User class directly

        } catch (WeakPasswordException e) {
            System.out.println("WeakPasswordException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
