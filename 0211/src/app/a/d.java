package app.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class d{
    public static void main(String[] args) {
    	String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String id="hr";
		String pw = "1234";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner s = new Scanner(System.in);
		//int eid = s.nextInt();
		String name = s.next();
		s.close();
		String query="select * from employee where ename=\'"+name+"\'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,id,pw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				int eno = rs.getInt(1);
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int manager = rs.getInt("manager");
				String hireDate = rs.getString("hiredate");
				int salary = rs.getInt("salary");
				int commission = rs.getInt("commission");
				int dno = rs.getInt("dno");
				
				System.out.println(eno+"\t"+ename+"\t"+job+"\t"+manager+"\t"+hireDate+"\t"+salary+"\t"+commission+"\t"+dno);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    }
}