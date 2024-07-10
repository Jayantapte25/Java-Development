package SQLITE.CRUD;

import java.util.ArrayList; // Import ArrayList
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Moved Scanner initialization outside the loop
        while(true){
            System.out.println("Employee Management System");
            System.out.println("1. Create Employee, 2. Update Employee, 3. Read Employee, 4. Delete Employee, 5. Exit");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("id, last_name, first_name, email, department, salary");
                    int id = sc.nextInt();
                    String last_name = sc.next();
                    String first_name = sc.next();
                    String email = sc.next();
                    String department = sc.next();
                    int salary = sc.nextInt();
                    Employee emp = new Employee(id, last_name, first_name, email, department, salary);
                    try {
                        EmployeeDao.createEmployee(emp);
                    } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                        System.out.println("Error: Employee with this ID already exists.");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("id, last_name, first_name, email, department, salary");
                    int id1 = sc.nextInt();
                    String last_name1 = sc.next();
                    String first_name1 = sc.next();
                    String email1 = sc.next();
                    String department1 = sc.next();
                    int salary1 = sc.nextInt();
                    try {
                        EmployeeDao.updateEmployee(id1, last_name1, first_name1, email1, department1, salary1);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    try {
                        ArrayList<Employee> list = EmployeeDao.readEmployee();
                        for(Employee e : list){
                            System.out.println(e);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    System.out.println("Enter id to delete");
                    int id2 = sc.nextInt();
                    try {
                        EmployeeDao.deleteEmployee(id2);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    sc.close(); // Close the scanner before exiting
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
