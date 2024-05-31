package SQLITE.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; // Added import for SQLException

public class DB {
    static Connection conn = null;
    public static Connection connect() { // Fixed return type to Connection
        try{
            String url = "jdbc:mysql://localhost:3306/test_db";
            String username = "jayant";
            String password = "12345678";

            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) { // Changed Exception to SQLException
            System.out.println(e);
        }
        return conn; // Fixed return statement position
    }
}
