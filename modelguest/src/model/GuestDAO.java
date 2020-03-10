package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GuestDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<GuestVO> guestList(){
		String sql = "select * from tbl_guest";
		List<GuestVO> list = new ArrayList<GuestVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				GuestVO vo = new GuestVO();
				vo.setContents(rs.getString("contents"));
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setSubject(rs.getString("subject"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				return list;
			} catch (Exception e2) {
				e2.printStackTrace();
				return list;
			}
		}
	}
	
	public GuestVO guestSelect(int idx) {
		String sql ="select * from tbl_guest where idx = ?";
		GuestVO vo = new GuestVO();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			rs=ps.executeQuery();
			if(rs.next()) {
				vo.setContents(rs.getString("contents"));
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setSubject(rs.getString("subject"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				return vo;
			} catch (Exception e2) {
				e2.printStackTrace();
				return vo;
			}
		}
	}
	
	public int guestReadcnt(int idx) {
		String sql = "update tbl_guest set readcnt = readcnt +1 where idx=?";
		int row = 0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
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
			} catch (Exception e2) {
				e2.printStackTrace();
				return row;
			}
		}
	}
	
	
}
