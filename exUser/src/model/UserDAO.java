package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class UserDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<UserVO> userList() {
		String sql = "select * from usertbl";
		List<UserVO> list = new ArrayList<UserVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setEmail(rs.getString("email"));
				vo.setFirst_time(rs.getString("first_time"));
				vo.setIdx(rs.getInt("idx"));
				vo.setLast_time(rs.getString("last_time"));
				vo.setName(rs.getString("name"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setTel(rs.getString("tel"));
				vo.setUserid(rs.getString("userid"));
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
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return list;
		}
	}

	public int userCount() {
		String sql = "select count(*) from usertbl";
		int cnt = 0;
		try {
			conn = manager.getConnection();
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
				if(conn!=null)conn.close();	
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return cnt;
		}
	}
}
