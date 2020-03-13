package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class PdsDAO {
	private static PdsDAO instance = new PdsDAO();
	private PdsDAO() {}
	public static PdsDAO getInstance() {
		return instance;
	}
	
//	public Connection getConnection() {
//		Connection conn = null;
//		try {
//			Context initContext = new InitialContext();
//		    Context envContext  = (Context)initContext.lookup("java:/comp/env");
//		    DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
//		    conn = ds.getConnection();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return conn;
//	}
	
	public List<PdsVO> pdsList(Connection conn){
//		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from pds";
		List<PdsVO> list = new ArrayList<PdsVO>();
		try {
//			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				PdsVO vo = new PdsVO();
				vo.setContents(rs.getString("contents"));
				vo.setEmail(rs.getString("email"));
				vo.setFilename(rs.getString("filename"));
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setPass(rs.getString("pass"));
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
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return list;
		}
	}
	
	public int pdsCount(Connection conn) {
//		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select count(*) as count from pds";
		int cnt = 0;
		try {
//			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
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
			} catch (Exception e2) {
				// TODO: handle exception
			}
			return cnt;
			
		}
	}
	
	public int pdsWrite(PdsVO vo, Connection conn) {
//		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "insert into pds(idx,name,email, pass, subject, contents, filename) values(pds_seq_idx.nextval,?,?,?,?,?,?)";
		int row = 0;
		try {
//			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getEmail());
			ps.setString(3, vo.getPass());
			ps.setString(4, vo.getSubject());
			ps.setString(5, vo.getContents());
			ps.setString(6, vo.getFilename());
			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(ps!=null)ps.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			return row;
		}
	}
}
