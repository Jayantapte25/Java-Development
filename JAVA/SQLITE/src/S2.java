package SQLITE.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class S2 {
    public static void main(String[] args) {
        // Database credentials
        String jdbcUrl = "jdbc:mysql://localhost:3306/test_db";
        String username = "jayant";
        String password = "12345678";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            statement = connection.createStatement();

            // Execute a query to get all the data from the employees table
            String sql = "SELECT * FROM employees";
            resultSet = statement.executeQuery(sql);

            // Get metadata to retrieve column names and count
            ResultSetMetaData jayant = resultSet.getMetaData();

            while (resultSet.next()) {
                for (int i = 1; i <= jayant.getColumnCount(); i++) {
                    System.out.print(resultSet.getString(i) + "\t"); //this will print the data in the table & \t is used to give space between the data
                }
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
