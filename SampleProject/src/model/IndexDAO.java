package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class IndexDAO {
	DBManager manager= DBManager.getInstance();
	Connection conn = null;
	PreparedStatement ps= null;
	ResultSet rs= null;
	
	public MemVO loginIndex(String userid, String passwd) {
		String sql = "select * from member where userid = ? and passwd = ?";
		int row = 0;
		MemVO vo = new MemVO();		
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, passwd);
			rs = ps.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setIdx(rs.getInt("idx"));
			}
			else {
				vo.setName("-1");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn !=null)conn.close();
				return vo;
			} catch (Exception e2) {
				e2.printStackTrace();
				return vo;
			}
		}
	}
	
	public List<BoardVO> indexBoardSearchList(int startlist, int endlist, String genre, String item, String key) {
		String sql = "select A.* from (select rownum as rn,B.* from (select * from " +genre+ " where "+item+ " like ? order by regdate desc) B) A where rn > ? and rn <= ? ";
		List<BoardVO> list= new ArrayList<BoardVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+key+"%");
			ps.setInt(2, startlist);
			ps.setInt(3, endlist);
			rs = ps.executeQuery();
			for(;rs.next();) {
					BoardVO vo = new BoardVO();
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
	
	public int indexBoardSearchCnt(String genre, String item, String key) {
		String sql = "select count(*) from "+genre+" where "+item+" like ?";
		int cnt = 0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+key+"%");
			rs=ps.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt(1);				
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
}
