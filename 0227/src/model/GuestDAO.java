package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GuestDAO {
	public static GuestDAO instance = new GuestDAO();
	private GuestDAO() {}
	public static GuestDAO getInstance() {
		return instance;
	}
	
	public static Connection getConnection() throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String user = "jsl40";
		String pw = "1234";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);
			return conn;			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<GuestVO> guestList() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tbl_guest order by idx desc";
		List<GuestVO> list = new ArrayList<GuestVO>();
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			for(;rs.next();) {
				GuestVO vo = new GuestVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				list.add(vo);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return list;
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}	
	
	public void guestWrite(String name, String subject, String content) {
		Connection conn = null;
		PreparedStatement ps = null;
		String query = "insert into tbl_guest(idx,name,subject,contents) values(guest_seq_idx.nextval,?,?,?)";
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(query);
			
			ps.setString(1, name);
			ps.setString(2, subject);
			ps.setString(3, content);
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			}
			catch(Exception e) {
				
			}
		}
	}
	
	public int guestWrite(GuestVO vo) {
		Connection conn = null;
		PreparedStatement ps = null;
		String query = "insert into tbl_guest(idx,name,subject,contents) values(guest_seq_idx.nextval,?,?,?)";
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(query);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getContents());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				return ps.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
	}
	
	public GuestVO guestSelect(int idx) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tbl_guest where idx = ?";
		GuestVO vo = new GuestVO();
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			rs= ps.executeQuery();
			rs.next();
			vo.setContents(rs.getString("contents"));
			vo.setName(rs.getString("name"));
			vo.setReadcnt(rs.getInt("readcnt"));
			vo.setRegdate(rs.getString("regdate"));
			vo.setSubject(rs.getString("subject"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				return vo;
			}
			catch(Exception e) {
				e.printStackTrace();
				return vo;
			}
		}
	}
	
	public void guestReadcnt(int idx) {
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			conn = getConnection();
			String sql = "update tbl_guest set readcnt=readcnt+1 where idx=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			ps.execute();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public int guestUpdate(GuestVO vo) {
		Connection conn = null;
		PreparedStatement ps = null;
		String query = "update tbl_guest set subject = ?, contents = ? where idx = ?";
		int row = 0;
		try {
			conn = getConnection();
			ps = conn.prepareStatement(query);
			
			ps.setString(1, vo.getSubject());
			ps.setString(2, vo.getContents());
			ps.setInt(3,vo.getIdx());
			row = ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				return row;
			}
			catch(Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
	}
	
	public int guestDelete(int idx) {
		Connection conn = null;
		PreparedStatement ps = null;
		String query = "delete from tbl_guest where idx = ?";
		int row =0;
		try {
			conn = getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, idx);
			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				return row;
			}
			catch(Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
	}
}
