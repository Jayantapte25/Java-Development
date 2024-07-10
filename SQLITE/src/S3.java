package SQLITE.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class S3 {
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

            String sql = "INSERT INTO students (name, subject, marks, passed) VALUES ('Kathy', 'Mathematics', 82, TRUE)";
            int rowsAffected = statement.executeUpdate(sql);

            resultSet = statement.executeQuery("SELECT * FROM students");

            ResultSetMetaData metaData = resultSet.getMetaData();

            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
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
