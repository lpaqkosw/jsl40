package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private static DBManager instance = new DBManager();

	private DBManager() {};
	
	public static DBManager getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception{
		Connection conn = null;
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myUrl = "jdbc:oracle:thin:@localhost:1521/XE";
		String myUser = "hr";
		String myPw = "1234";
		
		Class.forName(myDriver);
		conn = DriverManager.getConnection(myUrl, myUser, myPw);
		return conn;
	}
}
