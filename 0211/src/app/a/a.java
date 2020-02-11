package app.a;
//db connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class a {

	public static void main(String[] args) {
		// Load Driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB Loading Success");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Loading failed");
		}
		
		//Connect to db
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String id="hr";
		String pw = "1234";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("connection success");
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connection failed");
		}
		//SQL
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from department");
			while(rs.next()) {
				System.out.print(rs.getInt("DNO")+"\t");
				System.out.print(rs.getString("DNAME")+"\t");
				System.out.println(rs.getString("loc")+"\t");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//Close Connection
		try{
			rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e){

		}
	}
}
