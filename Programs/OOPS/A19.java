
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

public class A19 {
    public static void searchByName(Employee[] employees, int numEmployees, String searchName) {
        boolean found = false;
        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getName().equals(searchName)) {
                employees[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with the name " + searchName + ".");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); 

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            employees[i] = new Employee(name, id, salary);
        }

        System.out.print("\nEnter the name to search for: ");
        String searchName = scanner.nextLine();

        System.out.println("\nSearching for employees with the name " + searchName + ":");
        searchByName(employees, numEmployees, searchName);

        scanner.close();
    }
}