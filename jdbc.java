
 import java.sql.*;
 public class jdbc {
    public static void main(String[] args) {
 Connection con = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            // Establish a connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", " ");
            if (!con.isClosed()) {
                System.out.println("Successfully connected to MySQL server...");
            }
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } 
        finally {

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                // Handle errors for closing the connection
                e.printStackTrace();
            }
        }
    }
 }