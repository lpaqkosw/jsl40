package board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import board.util.DBManager;

public class BoardDAO {
	DBManager manager= DBManager.getInstance();
	Connection conn = null;
	PreparedStatement ps= null;
	ResultSet rs= null;
	
	public int boardCount() {
		String sql = "select count(*) as count from board";
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
	
	public List<BoardVO> boardList() {
		String sql = "select * from board order by idx desc";
		int cnt =0;
		List<BoardVO> list= new ArrayList<BoardVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
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
	
	public int boardWrite(BoardVO vo) {
		String sql = "insert into board(idx,name,pass,email,subject,contents) values(board_seq_idx.nextval,?,?,?,?,?)";
		int row =0;
		List<BoardVO> list= new ArrayList<BoardVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getPass());
			ps.setString(3, vo.getEmail());
			ps.setString(4, vo.getSubject());
			ps.setString(5, vo.getContents());
			row=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				return row;
			} catch (Exception e2) {
				e2.printStackTrace();
				return row;
			}
		}
	}
	
	public void boardReadcnt(int idx) {
		String sql = "update board set readcnt=readcnt+1 where idx = ?";
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			ps.executeUpdate();
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
	
	public BoardVO boardSelect(int idx) {
		String sql = "select * from board where idx = ?";
		BoardVO vo = new BoardVO();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			rs = ps.executeQuery();
			if(rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setEmail(rs.getString("email"));
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
	
	public int boardDelete(int idx, String pass) {
		String sql="delete from board where idx=? and pass=?";
		int row = 0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			ps.setString(2, pass);
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
	
	public int boardModify(BoardVO vo) {
		String sql = "update board set subject=?, contents=?, email=? where idx = ? and pass = ?";
		int row=0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getSubject());
			ps.setString(2, vo.getContents());
			ps.setString(3, vo.getEmail());
			ps.setInt(4, vo.getIdx());
			ps.setString(5, vo.getPass());
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
	
	public List<BoardVO> boardSearch(String search, String key){
		String sql= "select * from board where "+search+" like ?";
		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+key+"%");
			rs = ps.executeQuery();
			while(rs.next()) {
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
	
	public int boardCount(String search, String key) {
		String sql = "select count(*) as count from board where "+search+" like ?";
		int cnt =0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+key+"%");
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
	
	//page select included
	public List<BoardVO> boardList(int startlist, int endlist) {
		String sql = "select A.* from (select rownum as rn,B.* from (select * from board order by regdate desc) B) A where rn > ? and rn <= ? ";
		List<BoardVO> list= new ArrayList<BoardVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, startlist);
			ps.setInt(2, endlist);
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
}
