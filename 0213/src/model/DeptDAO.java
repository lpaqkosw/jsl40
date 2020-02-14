package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<DeptVO> getList() throws Exception {
		List<DeptVO> list = new ArrayList<DeptVO>();
		conn = manager.getConnection();
		String query = "select * from department";
		pstmt = conn.prepareStatement(query);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			DeptVO vo = new DeptVO();
			vo.setDno(rs.getInt("dno"));
			vo.setDname(rs.getString("dname"));
			vo.setLoc(rs.getString("loc"));
			list.add(vo);
		}
		
		pstmt.close();
		conn.close();
		
		return list;
	}
	
	public int insertDept(int dno, String dname, String loc) throws Exception{
		String query = "insert into department values(?,?,?)";
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, dno);
		pstmt.setString(2, dname);
		pstmt.setString(3, loc);
		int row = pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
		return row;
	}
	
	public List<DeptVO> selectDept(int dno) throws Exception{
		List<DeptVO> list = new ArrayList<DeptVO>();
		String query = "select * from department where dno = ?";
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, dno);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			DeptVO vo = new DeptVO();
			vo.setDname(rs.getString("dname"));
			vo.setDno(rs.getInt("dno"));
			vo.setLoc(rs.getString("loc"));
			list.add(vo);
		}
		
		pstmt.close();
		conn.close();
		
		return list;
	}
	
	public int updateDept(int dno, String dname, String loc) throws Exception{
		String query = "update department set dname=?, loc = ? where dno =?";
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, dname);
		pstmt.setString(2, loc);
		pstmt.setInt(3, dno);
		int row = pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
		return row;
		
	}
	
	public int deleteDept(int dno)throws Exception{
		String query = "Delete from department where dno = ?";
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, dno);
		int row = pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
		return row;
	}
}
