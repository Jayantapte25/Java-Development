package DSA;
import java.util.*;

public class D11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of users:");
        int numUsers = Integer.parseInt(sc.nextLine());

        Map<String, List<String[]>> userMap = new HashMap<>();

        for (int i = 1; i <= numUsers; i++) {
            System.out.println("Enter the user " + i + " details:");
            System.out.print("City: ");
            String city = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Pin code: ");
            String pinCode = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            String age = sc.nextLine();

            String[] userDetails = {address, pinCode, name, age};

            List<String[]> userDetailsList = userMap.getOrDefault(city, new ArrayList<>()); //DR - only copies array & not the key value pair.
            userDetailsList.add(userDetails); //DP

            //here we are creating an array of string arrays.
            //first we add the address, pincode, name and age to the array
            //then we add this array to the list which is then added to the map.
            //this way we can store multiple user details for a single city.
            //as key values cannot be repeated, we can store multiple values for a single key by using a list.

            //when we input the city name second time, DR line add earlier city data into an list & then add new data into the list in the DP line.

            userMap.put(city, userDetailsList); //Here we are adding list of strng arrays to the map second time when same key name is entered as city.
        }

        System.out.println("Enter your city:");
        String searchCity = sc.nextLine();

        if (userMap.containsKey(searchCity)) {
            List<String[]> userDetailsList = userMap.get(searchCity);
            System.out.println("User details for city " + searchCity + ":");
            for (String[] userDetails : userDetailsList) {
                System.out.println("Address: " + userDetails[0]);
                System.out.println("Pin code: " + userDetails[1]);
                System.out.println("Name: " + userDetails[2]);
                System.out.println("Age: " + userDetails[3]);
                System.out.println("-------------------");
            }
        } else {
            System.out.println("City details not found");
        }

        sc.close();
    }
}
