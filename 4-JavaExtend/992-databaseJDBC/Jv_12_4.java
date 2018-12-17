import java.sql.*;

class Jv_12_4 {
   public void delete(String qry) throws SQLException, Exception {
        Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
        String url = "jdbc:odbc:student";
        Connection con = DriverManager.getConnection(url,"java","java");
        Statement smt = con.createStatement();

        String theQuery = qry;
        int i = smt.executeUpdate(theQuery);
        System.out.println("레코드"+i+"개의 삭제가 성공!!");

        smt.close();
        con.close();
   }

  public static void main(String args[]) throws Exception {
         Jv_12_4 del = new Jv_12_4();
         del.delete(args[0]);
   }
  }