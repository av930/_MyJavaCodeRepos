import java.sql.*;

public class Jv_12_2 {
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

            String strSql = "select * from entity order by hakbun";
  	    ResultSet result = st.executeQuery(strSql);
	    System.out.println("질의문 처리 성공!" + "\n");

            ResultSetMetaData rmdata = result.getMetaData();
            int cols = rmdata.getColumnCount();

     	    System.out.println("===== 데이터 검색 결과 출력 =====");
   	    System.out.println("학번	" + "이름	" + "전자메일	" + "전화번호	" + "주소");
          
            while (result.next()) {
                for (int i=1; i <= cols; i++) {
       		  	   System.out.print(result.getString(i) + "\t");
                    } 
	  	   System.out.println( );
            }

           st.close();
           con.close();
      } catch(SQLException e) {
     	   System.out.println("SQLException: " + e.getMessage());
     } 		
  }   
}