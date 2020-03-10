package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager 
{
	private DBManager() {}
	
	private static DBManager instance = new DBManager();
	
	public static DBManager getInstance()
	{
		return instance;
	}
	
	public Connection getConnection()
	{
		Connection conn = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"jsl40", 
					"1234");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
}
