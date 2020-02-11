package app.a;
//preparedstatement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class f{
    public static void main(String[] args) {
    	String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String id="hr";
		String pw = "1234";
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner s = new Scanner(System.in);
		int dnoIn = s.nextInt();
		s.close();
		//String name = s.next();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,id,pw);
			//String query="select * from employee where ename=\'"+name+"\'";
			//stmt = con.createStatement();
			String query="select * from employee where dno=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, dnoIn);
			rs = pstmt.executeQuery();
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