package SQLITE.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class S2 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/test_db";
        String username = "jayant";
        String password = "12345678";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(jdbcUrl, username, password);

            statement = connection.createStatement();

            String sql = "SELECT * FROM employees";
            resultSet = statement.executeQuery(sql);

            ResultSetMetaData jayant = resultSet.getMetaData();

            while (resultSet.next()) {
                for (int i = 1; i <= jayant.getColumnCount(); i++) {
                    System.out.print(resultSet.getString(i) + "\t"); 
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
