package FileHandling;

import java.util.*;
import java.io.*;


public class F7 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the name");
            String name = sc.nextLine();

            System.out.println("Enter the City Name");
            String city = sc.nextLine();

            System.out.println("Enter the Country Code");
            String countryCode = sc.nextLine();

            BufferedWriter bw = new BufferedWriter(new FileWriter("input.csv"));

            String line = name + "," + city + "," + countryCode;
            bw.write(line);
            bw.flush();

            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("input.csv"));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
