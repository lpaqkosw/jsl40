package sample.model.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sample.util.DBCon;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {
		return instance;
	}
	
	public int countBoard() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql = "select count(*) from board";
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
	
	public int writeBoard(BoardVO vo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql ="insert into board(idx,name,email,subject,contents,pass) values(board_seq_idx.nextval,?,?,?,?,?)";
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getEmail());
			ps.setString(3, vo.getSubject());
			ps.setString(4, vo.getContents());
			ps.setString(5, vo.getPass());
			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DBCon.closeConnection(conn, ps);
		}
		return row;
	}
	
	public List<BoardVO> listBoard(int startlist, int endlist){
		List<BoardVO> list = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from (select rownum as rn, A.* from (select * from board order by regdate desc) A) where rn > ? and rn <= ?";
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, startlist);
			ps.setInt(2, endlist);
			rs=ps.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setSubject(rs.getString("subject"));
				vo.setName(rs.getString("name"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
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
	
	public BoardVO viewBoard(int idx) {
		BoardVO vo = new BoardVO();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from board where idx = ?";
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			rs = ps.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setRegdate(rs.getString("regdate"));
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
	
	public int delBoard(int idx, String pass) {
		int row = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "delete from board where idx=? and pass=?";
		try {
			conn = DBCon.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, idx);
			ps.setString(2, pass);
			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DBCon.closeConnection(conn, ps);
		}
		return row;
	}
	
	public int modBoard(BoardVO vo){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "update board set name=?,subject=?,contents=?,email=? where idx=? and pass=?";
		int row = 0;
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2,vo.getSubject());
			ps.setString(3, vo.getContents());
			ps.setString(4, vo.getEmail());
			ps.setInt(5, vo.getIdx());
			ps.setString(6, vo.getPass());
			row = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DBCon.closeConnection(conn, ps, rs);
		}
		return row;
	}
	
	public int readBoard(int idx) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "update board set readcnt=readcnt+1 where idx=?";
		int row = 0;
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			row = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DBCon.closeConnection(conn, ps, rs);
		}
		return row;
	}
	
	public List<BoardVO> searchListBoard(String option, String key, int startlist, int endlist){
		List<BoardVO> list = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from (select rownum as rn, A.* from board A where "+option+" like ?) where rn > ? and rn <= ?";
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+key+"%");
			ps.setInt(2, startlist);
			ps.setInt(3, endlist);
			rs = ps.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setSubject(rs.getString("subject"));
				vo.setName(rs.getString("name"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
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
	
	public int countSearchListBoard(String option, String key) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int cnt = 0;
		String sql = "select count(*) from board where "+option+" like ?";
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+key+"%");
			rs = ps.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DBCon.closeConnection(conn, ps, rs);
		}
		return cnt;
	}
}
