package SQLITE.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDao {
    public static boolean employeeExists(int id) throws SQLException {
        Connection conn = DB.connect();
        String query = "SELECT COUNT(*) FROM employees WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return rs.getInt(1) > 0;
    }

    public static void createEmployee(Employee emp) throws SQLException {
        if (employeeExists(emp.getId())) {
            throw new java.sql.SQLIntegrityConstraintViolationException("Duplicate entry for id: " + emp.getId());
        }
        Connection conn = DB.connect();
        String query = Query.Create;

        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, emp.getId());
        stmt.setString(2, emp.getLastName());
        stmt.setString(3, emp.getFirstName());
        stmt.setString(4, emp.getEmail());
        stmt.setString(5, emp.getDepartment());
        stmt.setInt(6, emp.getSalary());

        stmt.executeUpdate();
    }

    public static void updateEmployee(int id, String lastName, String firstName, String email, String department, int salary) throws SQLException {
        Connection conn = DB.connect();
        String query = Query.Update;

        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, lastName);
        stmt.setString(2, firstName);
        stmt.setString(3, email);
        stmt.setString(4, department);
        stmt.setInt(5, salary);
        stmt.setInt(6, id);

        stmt.executeUpdate();
    }

    public static void deleteEmployee(int id) throws SQLException {
        Connection conn = DB.connect();
        String query = Query.Delete;

        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }

    public static ArrayList<Employee> readEmployee() throws SQLException {
        ArrayList<Employee> empList = new ArrayList<>();
        Connection conn = DB.connect();
        String query = Query.Read;

        PreparedStatement stmt = conn.prepareStatement(query); // Changed to PreparedStatement
        ResultSet rs = stmt.executeQuery();

        while(rs.next()) {
            Employee emp = new Employee(rs.getInt("id"), rs.getString("last_name"), rs.getString("first_name"), rs.getString("email"), rs.getString("department"), rs.getInt("salary"));
            empList.add(emp);
        }
        return empList;
    }
}
