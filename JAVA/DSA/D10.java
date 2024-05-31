package DSA;

import java.util.*;

public class D10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> emailSet = new HashSet<>(); //In set we can't have duplicate values

        while (true) {
            System.out.println("Enter Email address");
            String email = sc.nextLine();
            emailSet.add(email);

            System.out.println("Do you want to Continue?(yes/no)");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Enter the email addresses to be searched separated by comma");
        String emailCsv = sc.nextLine();
        String[] emailsToSearch = emailCsv.split(",");

        Set<String> searchSet = new HashSet<>(Arrays.asList(emailsToSearch));

        //The reason for converting the array to a HashSet is to utilize the HashSet's containsAll method, which checks if all elements in one set are contained in another set.

        //Arrays.asList(emailsToSearch) converts the array emailsToSearch into a List.
        //So Arrays.asList(emailsToSearch) will produce a List containing ["bala@google.co.in", "jeryy@gmail.com"].

        if (emailSet.containsAll(searchSet)) {
            System.out.println("Email addresses are present");
        } else {
            System.out.println("Email addresses are not present");
        }

        sc.close();
    }
}
