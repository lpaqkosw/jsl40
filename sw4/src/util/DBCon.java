package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	 public static Connection getConnection() throws Exception{
	 Class.forName("oracle.jdbc.OracleDriver");
	 Connection con =
	 DriverManager.getConnection
	 ("jdbc:oracle:thin:@//localhost:1521/xe","jsl40","1234");
	 return con;
	 }

}
