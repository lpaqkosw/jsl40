package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class MemDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public int memInsert(MemVO vo) {
		String sql ="insert into member(idx,name,userid,passwd,gubun,zipcode,addr1,addr2,tel,email,job,intro,favorite) values(member_seq_idx.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
		int row = 0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getUserid());
			ps.setString(3, vo.getPasswd());
			ps.setString(4, vo.getGubun());
			ps.setString(5, vo.getZipcode());
			ps.setString(6, vo.getAddr1());
			ps.setString(7, vo.getAddr2());
			ps.setString(8, vo.getTel());
			ps.setString(9, vo.getEmail());
			ps.setString(10, vo.getJob());
			ps.setString(11, vo.getIntro());
			ps.setString(12, vo.getFavorite());
			row=ps.executeUpdate();
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
	
	public List<MemVO> memList(){
		List<MemVO> list = new ArrayList<MemVO>();
		String sql = "select * from member";
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				MemVO vo =new MemVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setUserid(rs.getString("userid"));
				vo.setTel(rs.getString("tel"));
				vo.setFirst_time(rs.getString("first_time"));
				vo.setLast_time(rs.getString("last_time"));
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
	
	public boolean memIdCheck(String id) {
		String sql ="select * from member where userid=?";
		boolean bool = false;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				bool = true;
				throw new Exception();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				return bool;
			} catch (Exception e2) {
				e2.printStackTrace();
				return bool;
			}
		}
	}
	
	public List<ZipcodeVO> zipcodeList(String dong){
		String sql="select * from zipcode where dong like ?";
		List<ZipcodeVO> list = new ArrayList<ZipcodeVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+dong+"%");
			rs = ps.executeQuery();
			while(rs.next()) {
				ZipcodeVO vo = new ZipcodeVO();
				vo.setBunji(rs.getString("bunji"));
				vo.setDong(rs.getString("dong"));
				vo.setGugun(rs.getString("gugun"));
				vo.setSido(rs.getString("sido"));
				vo.setZipcode(rs.getString("zipcode"));
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
	
	public MemVO memLogin(String userid, String passwd) {
		String sql = "select * from member where userid=? and passwd=?";
		MemVO vo = new MemVO();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, passwd);
			rs = ps.executeQuery();
			if(rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setUserid(rs.getString("userid"));
				vo.setTel(rs.getString("tel"));
				vo.setFirst_time(rs.getString("first_time"));
				vo.setLast_time(rs.getString("last_time"));
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
				return vo;
			}
		}
	}
	
	public MemVO memSelect(int idx) {
		String sql = "select * from member where idx = ?";
		MemVO vo = new MemVO();
		
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			rs = ps.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setUserid(rs.getString("userid"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setGubun(rs.getString("gubun"));
				vo.setZipcode(rs.getString("zipcode"));
				vo.setAddr1(rs.getString("addr1"));
				vo.setAddr2(rs.getString("addr2"));
				vo.setTel(rs.getString("tel"));
				vo.setEmail(rs.getString("email"));
				vo.setJob(rs.getString("job"));
				vo.setIntro(rs.getString("intro"));
				vo.setFavorite(rs.getString("favorite"));
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
	
	public int memUpdate(MemVO vo, int idx) {
		String sql = "update member set userid=?, passwd=?, name=?, gubun=?, zipcode=?, addr1=?, addr2=?, tel=?, email=?, favorite=?, job=?, intro=? where idx=?";
		int row = 0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getUserid());
			ps.setString(2, vo.getPasswd());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getGubun());
			ps.setString(5, vo.getZipcode());
			ps.setString(6, vo.getAddr1());
			ps.setString(7, vo.getAddr2());
			ps.setString(8, vo.getTel());
			ps.setString(9, vo.getEmail());
			ps.setString(10, vo.getFavorite());
			ps.setString(11, vo.getJob());
			ps.setString(12, vo.getIntro());
			ps.setInt(13, idx);
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
	
	public int memDelete(String userid, String passwd, int idx) {
		String sql = "delete from member where userid=? and passwd=? and idx=?";
		int row =0;
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, passwd);
			ps.setInt(3, idx);
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
