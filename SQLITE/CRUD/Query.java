package SQLITE.CRUD;

public class Query {
    static String Create = "INSERT INTO employees (id, last_name, first_name, email, department, salary) VALUES (?, ?, ?, ?, ?, ?)";
    static String Update = "UPDATE employees SET last_name = ?, first_name = ?, email = ?, department = ?, salary = ? WHERE id = ?";
    static String Delete = "DELETE FROM employees WHERE id = ?";
    static String Read = "SELECT * FROM employees";
}
