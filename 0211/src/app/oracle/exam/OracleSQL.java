package app.oracle.exam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import app.oracle.oracledb.Conn;

public class OracleSQL extends Conn {
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;

    public void deptListPrint() throws Exception {
        String query = "select * from department";
        stmt = myConn.createStatement();
        rs = stmt.executeQuery(query);
        while (rs.next()) {
            int dno = rs.getInt("dno");
            String dname = rs.getString("dname");
            String loc = rs.getString("loc");
            System.out.println(dno + "\t" + dname + "\t" + loc);
        }
    }

    public void deptPrintByDno(int dno) throws Exception {
        String query = "select * from department where dno= ?";
        pstmt = myConn.prepareStatement(query);
        pstmt.setInt(1, dno);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int dnoR = rs.getInt("dno");
            String dname = rs.getString("dname");
            String loc = rs.getString("loc");
            System.out.println(dnoR + "\t" + dname + "\t" + loc);
        }
    }

    public void empPrintByDno(int dno) throws Exception {
        String query = "select * from employee where dno= ?";
        pstmt = myConn.prepareStatement(query);
        pstmt.setInt(1, dno);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int eno = rs.getInt("eno");
            String ename = rs.getString("ename");
            String job = rs.getString("job");
            int manager = rs.getInt("manager");
            String date = rs.getString("hiredate");
            int salary = rs.getInt("salary");
            int commission = rs.getInt("commission");
            int dnoR = rs.getInt("dno");
            System.out.println(eno + "\t" + ename + "\t" + job + "\t" + manager + "\t" + date + "\t" + salary + "\t"
                    + commission + "\t" + dnoR);
        }
    }

    public void empPrintByHireDate(String in) throws SQLException {
        String query = "select * from employee where hiredate >= ?";
        pstmt = myConn.prepareStatement(query);
        pstmt.setString(1,in);
        rs = pstmt.executeQuery();
        while(rs.next()){
            int eno = rs.getInt("eno");
            String ename = rs.getString("ename");
            String job = rs.getString("job");
            int manager = rs.getInt("manager");
            String date = rs.getString("hiredate");
            int salary = rs.getInt("salary");
            int commission = rs.getInt("commission");
            int dnoR = rs.getInt("dno");
            System.out.println(eno+"\t"+ename+"\t"+job+"\t"+manager+"\t"+date+"\t"+salary+"\t"+commission+"\t"+dnoR);
        }
    }

    public void nameSearch(String name) throws Exception{
        String query = "select * from "+ "employee where ename like ?";
        pstmt = myConn.prepareStatement(query);
        pstmt.setString(1,"%"+name+"%");
        rs = pstmt.executeQuery();
        while(rs.next()){
            int eno = rs.getInt("eno");
            String ename = rs.getString("ename");
            String job = rs.getString("job");
            int manager = rs.getInt("manager");
            String date = rs.getString("hiredate").substring(0,10);
            int salary = rs.getInt("salary");
            int commission = rs.getInt("commission");
            int dnoR = rs.getInt("dno");
            System.out.println(eno+"\t"+ename+"\t"+job+"\t"+manager+"\t"+date+"\t"+salary+"\t"+commission+"\t"+dnoR);
        }
    }

	@Override
	public void cleanUp() throws Exception {
		if(rs != null)rs.close();
        if(stmt != null)stmt.close();
        if(pstmt != null)pstmt.close();
	}
        
        
        
                
    

   

}