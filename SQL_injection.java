// Insecure: SQL injection vulnerability
import java.sql.*;

public class InsecureSQL {
    public static void main(String[] args) throws Exception {
        String userInput = args[0];
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
        Statement stmt = conn.createStatement();
        // User input unsafely included in SQL query
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE name = '" + userInput + "'");
        while (rs.next()) {
            System.out.println("User: " + rs.getString("name"));
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}
