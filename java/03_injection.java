// A03 - Injection. VULN: SQL injection in PreparedStatement misuse.
import java.sql.*;

public class Injection {
  public static ResultSet findUser(Connection conn, String user) throws SQLException {
    Statement stmt = conn.createStatement();
    // VULN: A03 - concatenated SQL
    return stmt.executeQuery("SELECT * FROM users WHERE name = '" + user + "'");
  }
}
