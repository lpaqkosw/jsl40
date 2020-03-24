package sample.model.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sample.util.DBCon;

public class GuestDAO {
	private static GuestDAO instance = new GuestDAO();
	public static GuestDAO getInstance() {
		return instance;
	}
	
	public List<GuestVO> listGuest(int startlist, int endlist){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from (select rownum as rn, A.* from (select * from guest order by regdate desc) A) where rn > ? and rn <= ?";
		List<GuestVO> list = new ArrayList<GuestVO>();
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, startlist);
			ps.setInt(2, endlist);
			rs = ps.executeQuery();
			while(rs.next()) {
				GuestVO vo = new GuestVO();
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setIdx(rs.getInt("idx"));
				list.add(vo);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DBCon.closeConnection(conn, ps, rs);
		}
		return list;
	}

	public int readGuest(int idx) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		String sql = "update guest set readcnt=readcnt+1 where idx = ?";
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DBCon.closeConnection(conn, ps);
		}
		return row;
		
	}

	public GuestVO viewGuest(int idx) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from guest where idx = ?";
		GuestVO vo = new GuestVO();
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			rs = ps.executeQuery();
			if(rs.next()) {
				vo.setContents(rs.getString("contents"));
				vo.setName(rs.getString("name"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setSubject(rs.getString("subject"));
				vo.setIdx(rs.getInt("idx"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DBCon.closeConnection(conn, ps, rs);
		}
		return vo;
	}

	public int countGuest() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select count(*) from guest";
		int row = 0;
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				row = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DBCon.closeConnection(conn, ps, rs);
		}
		return row;
	}

	public int writeGuest(GuestVO vo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "insert into guest(idx,name,subject,contents) values(guest_seq_idx.nextval,?,?,?)";
		int row = 0;
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getContents());
			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DBCon.closeConnection(conn, ps);
		}
		return row;
	}
}
