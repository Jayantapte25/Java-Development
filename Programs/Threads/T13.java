package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String name;
    private String mobileNumber;
    private String city;
    private String state;

    // Parameterized constructor
    public User(String name, String mobileNumber, String city, String state) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.city = city;
        this.state = state;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

// CityCount class
class CityCount extends Thread {
    private String city;
    private int count;
    private List<User> userList;

    // Parameterized constructor
    public CityCount(String city, List<User> userList) {
        this.city = city;
        this.userList = userList;
        this.count = 0;
    }

    // Getters and Setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (User user : userList) { //harsh //how the city data is counted?
            if (user.getCity().equalsIgnoreCase(city)) {
                count++;
            }
        }
    }
}

// Main class
public class T13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of users
        System.out.println("Enter the number of users:");
        int numberOfUsers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<User> userList = new ArrayList<>();

        // Get user details
        for (int i = 1; i <= numberOfUsers; i++) {
            System.out.println("Enter the details of user " + i);
            String[] userDetails = scanner.nextLine().split(",");
            userList.add(new User(userDetails[0], userDetails[1], userDetails[2], userDetails[3]));
        }

        // Get the number of cities
        System.out.println("Enter the number of cities:");
        int numberOfCities = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<CityCount> cityCountThreads = new ArrayList<>();

        // Get city names and create threads for each city
        for (int i = 1; i <= numberOfCities; i++) {
            System.out.println("Enter the name of city " + i);
            String cityName = scanner.nextLine();
            CityCount cityCount = new CityCount(cityName, userList); //harsh //what is stored in cityCount? 
            cityCountThreads.add(cityCount); //harsh //how it is getting added?
            cityCount.start();
        }

        // Wait for all threads to finish and print the results
        for (CityCount cityCount : cityCountThreads) {
            try {
                cityCount.join();
                System.out.println(cityCount.getCity() + "--" + cityCount.getCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}
