package SQLITE.CRUD;

public class Employee {
    int id;
    String last_name;
    String first_name;
    String email;
    String department;
    int salary;

    public Employee(int id, String last_name, String first_name, String email, String department, int salary) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {return id;}
    public String getLastName() {return last_name;} // Fixed method name from getLast_name to getLastName
    public String getFirstName() {return first_name;} // Fixed method name from getFirst_name to getFirstName
    public String getEmail() {return email;}
    public String getDepartment() {return department;}
    public int getSalary() {return salary;}

    @Override // Added override annotation
    public String toString() {
        return "Employee [id=" + id + ", last_name=" + last_name + ", first_name=" + first_name + ", email=" + email + ", department=" + department + ", salary=" + salary + "]";
    }
}
