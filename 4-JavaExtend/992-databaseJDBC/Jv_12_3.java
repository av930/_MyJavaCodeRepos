import java.sql.*;

class Jv_12_3 {
  public void insert(String hakbun, String name, String email, String tel, String address) throws SQLException, Exception{
       Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
       String url = "jdbc:odbc:student";
       Connection Con=DriverManager.getConnection(url,"java","java");
       Statement MyStmt = Con.createStatement();

       String theQuery = "insert into entity values('"+ hakbun + "','"+ name+"','"+email+"','" + tel+ "','" +address+"');";
       int i=MyStmt.executeUpdate(theQuery);
       System.out.println("레코드"+i+"개의 삽입 성공!");

       MyStmt.close();
       Con.close();
   }
   public static void main(String args[]) throws Exception {
        Jv_12_3 ist =new Jv_12_3();
        ist.insert(args[0],args[1],args[2],args[3],args[4]);
   }
}