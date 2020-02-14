package app.oracle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import app.oracle.dto.DeptVO;
import app.oracle.dto.EmpVO;
import app.oracle.oracledb.DBManager;

public class EmpDAO{
    DBManager manager = DBManager.getInstance();
    Connection conn = null;
    PreparedStatement pstmt= null;
    ResultSet rs = null;

    public List<DeptVO> deptList() throws Exception{
        List<DeptVO> list = new ArrayList<DeptVO>();
        String query = "select * from department";
        conn = manager.getConnection();
        pstmt = conn.prepareStatement(query);
        rs = pstmt.executeQuery();
        while(rs.next()){
            DeptVO vo = new DeptVO();
            vo.setDno(rs.getInt("dno"));
            vo.setDname(rs.getString("dname"));
            vo.setLoc(rs.getString("loc"));
            list.add(vo);
        }

        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(conn != null) conn.close();
        return list;
    }

    public List<EmpVO> empList() throws Exception{
        List<EmpVO> list = new ArrayList<EmpVO>();
        String query = "select * from employee";
        conn = manager.getConnection();
        pstmt = conn.prepareStatement(query);
        rs = pstmt.executeQuery();
        while(rs.next()){
            EmpVO vo = new EmpVO();
            vo.setDno(rs.getInt("dno"));
            vo.setEname(rs.getString("ename"));
            vo.setEno(rs.getInt("eno"));
            vo.setJob(rs.getString("job"));
            vo.setManager(rs.getInt("manager"));
            vo.setHiredate(rs.getString("hiredate"));
            vo.setSalary(rs.getInt("salary"));
            vo.setCommission(rs.getInt("commission"));
            list.add(vo);
        }

        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(conn != null) conn.close();
        return list;
    }
    
    public EmpVO selectEMP(int dno, String job) throws Exception{
    	EmpVO vo = null;
    	String query = "select * from employee where dno =? and job = ?";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	pstmt.setInt(1, dno);
    	pstmt.setString(2, job);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		vo = new EmpVO();
    		vo.setDno(rs.getInt("dno"));
            vo.setEname(rs.getString("ename"));
            vo.setEno(rs.getInt("eno"));
            vo.setJob(rs.getString("job"));
            vo.setManager(rs.getInt("manager"));
            vo.setHiredate(rs.getString("hiredate"));
            vo.setSalary(rs.getInt("salary"));
            vo.setCommission(rs.getInt("commission"));
    	}
    	return vo;
    }
    
    public List<EmpVO> getEmpByDnoOrJob(int dno, String job) throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select * from employee where dno=? or job=?";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	pstmt.setInt(1, dno);
    	pstmt.setString(2, job);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo= new EmpVO();
    		vo.setDno(rs.getInt("dno"));
            vo.setEname(rs.getString("ename"));
            vo.setEno(rs.getInt("eno"));
            vo.setJob(rs.getString("job"));
            vo.setManager(rs.getInt("manager"));
            vo.setHiredate(rs.getString("hiredate"));
            vo.setSalary(rs.getInt("salary"));
            vo.setCommission(rs.getInt("commission"));
            list.add(vo);
    	}
    	return list;
    }

}