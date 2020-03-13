package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {
	private static DBCon instance = new DBCon();
	public static DBCon getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","jsl40","1234");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return conn;
		}
	}
}
