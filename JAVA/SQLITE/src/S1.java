package SQLITE.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class S1 {
    public static void main(String[] args) {

        String j = "jdbc:mysql://localhost:3306/test_db";
        String u = "jayant";
        String p = "12345678";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(j, u, p);
            System.out.println("Connection established successfully!");

            statement = connection.createStatement(); //this is used to execute the query on the database and get the result

            String sql = "SELECT * FROM employees";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String email = resultSet.getString("email");
                String department = resultSet.getString("department");
                double salary = resultSet.getDouble("salary");
                
                // Print the data
                System.out.println("ID: " + id);
                System.out.println("Last Name: " + lastName);
                System.out.println("First Name: " + firstName);
                System.out.println("Email: " + email);
                System.out.println("Department: " + department);
                System.out.println("Salary: " + salary);
                System.out.println("---------------------------------------");
            }
        } catch (ClassNotFoundException e) { //this exception is thrown when the class is not found, class means the driver class
            e.printStackTrace(); //this will print the stack trace of the exception
        } catch (SQLException e) { //this exception is thrown when there is an error in the SQL query
            e.printStackTrace();
        }
    }
}
