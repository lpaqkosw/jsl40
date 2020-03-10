package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class GuestDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<GuestVO> guestList(){
		String sql = "select * from guest order by idx desc";
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
		String sql ="select * from guest where idx = ?";
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
		String sql = "update guest set readcnt = readcnt +1 where idx=?";
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
	
	public int guestInsert(GuestVO vo) {
		String sql = "insert into guest(idx,name,subject,contents,regdate) values(guest_seq_idx.nextval, ?,?,?,sysdate)";
		int row = 0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getContents());
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
	
	public int guestCount() {
		String sql = "select count(*) as count from guest";
		int cnt =0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				cnt =rs.getInt(1);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				return cnt;
			} catch (Exception e2) {
				e2.printStackTrace();
				return cnt;
			}
		}
	}
	
	public List<GuestVO> guestList(int startlist, int endlist) {
		String sql = "select A.* from (select rownum as rn,B.* from (select * from guest order by regdate desc) B) A where rn > ? and rn <= ? ";
		List<GuestVO> list= new ArrayList<GuestVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, startlist);
			ps.setInt(2, endlist);
			rs = ps.executeQuery();
			for(;rs.next();) {
					GuestVO vo = new GuestVO();
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
	
	public List<GuestVO> indexGuestList() {
		String sql2 = "select count(*) as count from guest";
		String sql = "select A.* from (select rownum as rn,B.* from (select * from guest order by regdate desc) B) A where rn > ? and rn <= ? ";
		List<GuestVO> list= new ArrayList<GuestVO>();
		int cnt = 0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql2);
			rs = ps.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt(1);
			}
			ps = conn.prepareStatement(sql);
			ps.setInt(1, cnt);
			ps.setInt(2, cnt-3);
			rs = ps.executeQuery();
			for(;rs.next();) {
					GuestVO vo = new GuestVO();
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
	
	public List<GuestVO> guestSearchList(int startlist, int endlist, String item, String key) {
		String sql = "select A.* from (select rownum as rn,B.* from (select * from guest where "+item+" like ? order by regdate desc) B) A where rn > ? and rn <= ? ";
		List<GuestVO> list= new ArrayList<GuestVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+key+"%");
			ps.setInt(2, startlist);
			ps.setInt(3, endlist);
			rs = ps.executeQuery();
			for(;rs.next();) {
					GuestVO vo = new GuestVO();
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
	
	
}
