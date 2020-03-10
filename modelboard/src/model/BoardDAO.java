package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {
		return instance;
	}
	
	public static Connection getConnection() throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "jsl40";
		String pw = "1234";
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, pw);
		return conn;
	}
	
	public List<BoardVO> listBoard(){
		List<BoardVO> list = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from board";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BoardVO vo= new BoardVO();
				vo.setComments(rs.getInt("comments"));
				vo.setEmail(rs.getString("email"));
				vo.setContents(rs.getString("contents"));
				vo.setIdx(rs.getInt("idx"));
				vo.setIp(rs.getString("ip"));
				vo.setName(rs.getString("name"));
				vo.setPw(rs.getString("pass"));
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
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into board(idx,pass,name,email,subject,contents,ip) values(board_seq_idx.nextval, ?,?,?,?,?,?)";
		int row = 0;
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getPw());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getEmail());
			ps.setString(4, vo.getSubject());
			ps.setString(5, vo.getContents());
			ps.setString(6, vo.getIp());
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
	
	public BoardVO boardSelect(int idx) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from board where idx = ?";
		BoardVO vo = new BoardVO();
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			rs=ps.executeQuery();
			rs.next();
			vo.setSubject(rs.getString("subject"));
			vo.setContents(rs.getString("contents"));
			vo.setName(rs.getString("name"));
			vo.setRegdate(rs.getString("regdate"));
			vo.setReadcnt(rs.getInt("readcnt"));
			vo.setEmail(rs.getString("email"));
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
	
	public int upReadcnt(int idx) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql= "update board set readcnt=readcnt+1 where idx=?";
		int row = 0;
		try {
			conn = getConnection();
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
	
	public int boardModify(BoardVO vo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String select = "select pass from board where idx = ?";
		int row =0;
		try {
			conn = getConnection();
			ps = conn.prepareStatement(select);
			ps.setInt(1, vo.getIdx());
			rs = ps.executeQuery();
			rs.next();
			if(!rs.getString("pass").equals(vo.getPw())) {
				return 0;
			}
			else {
				String update = "update board set name=?,email=?,subject =?, contents = ? where idx = ?";
				ps = conn.prepareStatement(update);
				ps.setString(1, vo.getName());
				ps.setString(2, vo.getEmail());
				ps.setString(3, vo.getSubject());
				ps.setString(4, vo.getContents());
				ps.setInt(5, vo.getIdx());
				row = ps.executeUpdate();
			}
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
	
	
}
