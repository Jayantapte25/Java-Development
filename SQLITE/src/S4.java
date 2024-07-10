package SQLITE.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class S4 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/test_db";
        String username = "jayant";
        String password = "12345678";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            statement = connection.createStatement();

            String updateSql = "UPDATE students SET marks = ? WHERE name = ?";
            preparedStatement = connection.prepareStatement(updateSql);

            preparedStatement.setInt(1, 90);
            preparedStatement.setString(2, "Bob"); 
            int updateRowsAffected = preparedStatement.executeUpdate();

            String deleteSql = "DELETE FROM students ORDER BY id DESC LIMIT 1";
            int deleteRowsAffected = connection.createStatement().executeUpdate(deleteSql);

            String gg = "SELECT * FROM students";
            resultSet = statement.executeQuery(gg);

            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name") + ", Marks: " + resultSet.getInt("marks"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
