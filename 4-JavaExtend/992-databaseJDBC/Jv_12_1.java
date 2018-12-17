import java.sql.*;

public class Jv_12_1 {
  public static void main(String args[]) {
    try {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      System.err.println("JDBC-ODBC 브릿지 드라이버의 적재(load) 성공!");
    } catch(java.lang.ClassNotFoundException e) {
      System.err.println("JDBC-ODBC 브릿지 드라이버의 적재(load) 실패!");
      System.err.println("ClassNotFoundException: " + e.getMessage());
    }

   try {
      Connection con = DriverManager.getConnection("jdbc:odbc:student");
      Statement st = con.createStatement();
      System.out.println("JDBC 드라이버의 연결(connection) 성공!");
      st.close();
      con.close();
    } catch(SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
    } 		
 }   
}