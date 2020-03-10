package board.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private static DBManager instance = new DBManager();
	public static DBManager getInstance() {
		return instance;
	}
	public Connection getConnection() throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String user = "jsl40";
		String password = "1234";
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
