package sample.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBCon {
	private static DBCon instance = new DBCon();
	
	public static DBCon getInstance() {
		return instance;
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return conn;
		
		}
	}
	
	public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) {
		try {
			rs.close();
			ps.close();
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeConnection(Connection conn, PreparedStatement ps) {
		try {
			ps.close();
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
