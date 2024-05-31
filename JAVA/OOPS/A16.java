import java.util.*;
import java.io.*;
import java.text.*;

class Customer {
    String name;
    String address;
    Integer age;
    String mobileNumber;

    public Customer(String name, String address, Integer age, String mobileNumber) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    public void displayCustomer() {
        System.out.println("Bill Details");
        System.out.println("Name " + this.name);
        System.out.println("Mobile " + this.mobileNumber);
        System.out.println("Age " + this.age);
        System.out.println("Address " + this.address);
    }
}

class SeniorCitizenCustomer extends Customer {
    public SeniorCitizenCustomer(String name, String address, int age, String mobileNumber) {
        super(name, address, age, mobileNumber);
    }

    Double getBillAmount(Double amount) {
        return (amount - (amount * 12 / 100));
    }
}

class PrivilegeCustomer extends Customer {
    public PrivilegeCustomer(String name, String address, int age, String mobileNumber) {
        super(name, address, age, mobileNumber);
    }

    Double getBillAmount(Double amount) {
        return (amount - (amount * 30 / 100));
    }
}

public class A16 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String address;
        Integer age;
        String mobileNumber;
        Double amount;

        System.out.println("1)Privilege Customer\n2)SeniorCitizen Customer\nEnter Customer Type");
        int n = Integer.parseInt(br.readLine());
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Enter The Name");
        name = br.readLine();
        System.out.println("Enter The Age");
        age = Integer.parseInt(br.readLine());
        System.out.println("Enter The Address");
        address = br.readLine();
        System.out.println("Enter The Mobile Number");
        mobileNumber = br.readLine();
        System.out.println("Enter The Purchased Amount");
        amount = Double.parseDouble(br.readLine());

        if (n == 1) {
            PrivilegeCustomer pc = new PrivilegeCustomer(name, address, age, mobileNumber);
            pc.displayCustomer();
            Double amnt = pc.getBillAmount(amount);
            System.out.println("Your bill amount is Rs " + amount + ". Your bill amount is discount under privilege customer\nYou have to pay Rs " + df.format(amnt));
        } else if (n == 2) {
            SeniorCitizenCustomer p = new SeniorCitizenCustomer(name, address, age, mobileNumber);
            p.displayCustomer();
            System.out.println("Your bill amount is Rs " + amount + ". Your bill amount is discount under senior citizen customer\nYou have to pay Rs " + df.format(p.getBillAmount(amount)));
        } else {
            System.out.println("Invalid Customer Type");
        }
    }
}
