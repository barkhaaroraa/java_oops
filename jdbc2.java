//  import java.sql.*;
//  public class jdbc2 {
//     public static void main(String[] args) {
//         String driverClassName = "com.mysql.cj.jdbc.Driver";
//         String url = "jdbc:mysql://localhost:3306/"; // Note: No specific database in the URL
//         String username = "Admin";
//         String password = "admin123";
//         String createDatabaseQuery = "CREATE DATABASE IF NOT EXISTS Student";
//         String useDatabaseQuery = "USE Student";
//         String createTableQuery = "CREATE TABLE IF NOT EXISTS stud_rec (rol_no INT, name VARCHAR(20))";
//         String insertRecordQuery = "INSERT INTO stud_rec (rol_no, name) VALUES (111, 'Tom')";
//         try {
//             // Load driver class
//             Class.forName(driverClassName);
//             // Obtain a connection
//             Connection con = DriverManager.getConnection(url, username, password);
//             // Create the database
//             Statement createDbStatement = con.createStatement();
//             createDbStatement.executeUpdate(createDatabaseQuery);
//             // Use the newly created database
//             Statement useDbStatement = con.createStatement();
//             useDbStatement.executeUpdate(useDatabaseQuery);
//             // Create the table
//             Statement createTableStatement = con.createStatement();
//             createTableStatement.executeUpdate(createTableQuery);
//             // Insert a record into the table
//             Statement insertStatement = con.createStatement();
//             int count = insertStatement.executeUpdate(insertRecordQuery);
//             System.out.println("Number of rows affected by this query: " + count);
//             // Closing the connection
//             con.close();
//         } catch (ClassNotFoundException | SQLException e) {
//             e.printStackTrace();
//         }
//     }
//string declarations

/**
 * jdbc2
 */
// public class jdbc2 {
//     public static void main(String[] args) {
//         String s="hello"; 
//         String s1= new String("hello"); //not in string pool till intern is called
//         StringBuffer s3=new StringBuffer("hello");
//         StringBuilder s4=new StringBuilder("hello");
//         s4.append("hehehe"); //concat stringbuilder
//         String s5=s1.concat(s); //
//         s3.append(5); //string vuffer

//         String s44=s.join(" ",s,s);
//         s1.intern();

//     }

    
}