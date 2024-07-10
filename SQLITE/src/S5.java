package SQLITE.src;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class S5 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/test_db";
        String username = "jayant";
        String password = "12345678";

        try (
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("Connection established successfully!");

            String storedProcedureCall = "{CALL archit(?, ?, ?)}";
            CallableStatement callableStatement = connection.prepareCall(storedProcedureCall);

            int studentId = 1;
            callableStatement.setInt(1, studentId);

            String subject = "Mathematics";
            callableStatement.setString(2, subject);

            callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
            callableStatement.registerOutParameter(3, java.sql.Types.INTEGER);

            callableStatement.execute();

            int modifiedMarks = callableStatement.getInt(3);
            System.out.println("Modified marks: " + modifiedMarks);

            callableStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
