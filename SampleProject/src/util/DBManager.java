package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private static DBManager instance = new DBManager();
	public static DBManager getInstance() {
		return instance;
	}
	public Connection getConnection() throws Exception{
		String driver= "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String user = "jsl40";
		String pw = "1234";
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,user,pw);
		return conn;
	}
}
