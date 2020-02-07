package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc1 {

	public static void main(String[] args) {
		//JDBC driver loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Load Success");
		}
		catch(Exception e) {
			System.out.println("Load Failed");
		}
		
		//JDBC connection
		try {
			String myURL = "jdbc:oracle:thin:@localhost:1521:XE";
			String myUser = "SYSTEM";
			String myPass = "1234";
			Connection con = DriverManager.getConnection(myURL,myUser,myPass);
			System.out.println("Connection success");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Connection Failed");
		}
		

	}

}
