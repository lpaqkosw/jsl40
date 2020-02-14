package app.oracle.exam2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import app.oracle.oracledb.DBManager;

public class ex{
    public static void main(String[] args) throws Exception {
        DBManager manager = DBManager.getInstance();
        Connection conn = manager.getConnection();
        System.out.println(conn);
        PreparedStatement pstmt = null;
        String query = "select * from employee";
        pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            int eno = rs.getInt("eno");
            String ename = rs.getString("ename");
            String job = rs.getString("job");
            int managerR = rs.getInt("manager");
            String date = rs.getString("hiredate");
            int salary = rs.getInt("salary");
            int commission = rs.getInt("commission");
            int dnoR = rs.getInt("dno");
            System.out.println(eno + "\t" + ename + "\t" + job + "\t" + managerR + "\t" + date + "\t" + salary + "\t"
                    + commission + "\t" + dnoR);
        }
    }
}