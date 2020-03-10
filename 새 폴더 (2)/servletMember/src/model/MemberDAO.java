package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class MemberDAO 
{
	private void rsRelease(
			Connection 			conn, 
			PreparedStatement 	pstmt, 
			ResultSet 			rs)
	{
		try
		{
			if (null != rs)
				rs.close();
			
			if (null != pstmt)
				pstmt.close();
			
			if (null != conn)
				conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// 회원정보 등록 메소드
	public boolean memberInsert(MemberVO vo)
	{
		Connection 			conn = null;
		PreparedStatement 	pstmt = null;
		String 				query;
		boolean 			result = false;
		
		query = "insert into tbl_member(idx, name, userid, passwd, gubun, "
				+ "tel, email, job, intro, favorite, zipcode, addr1, addr2) "
				+ "values (TBL_MEMBER_SEQ_IDX.NEXTVAL,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try
		{
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getUserid());
			pstmt.setString(3, vo.getPasswd());
			pstmt.setString(4, vo.getGubun());
			pstmt.setString(5, vo.getTel());
			pstmt.setString(6, vo.getEmail());
			pstmt.setString(7, vo.getJob());
			pstmt.setString(8, vo.getIntro());
			pstmt.setString(9, vo.getFavor());
			pstmt.setString(10, vo.getZipcode());
			pstmt.setString(11, vo.getAddr1());
			pstmt.setString(12, vo.getAddr2());
			
			result = pstmt.executeUpdate() != 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			rsRelease(conn, pstmt, null);
		}
		
		return result;
	}
	
	// id 중복 검사 메소드
	public int memberIDCheck(String userid)
	{
		Connection 			conn = null;
		PreparedStatement 	pstmt = null;
		ResultSet			rs = null;
		String 				query;
		int 				result = 0;
		
		query = "select count(*) from tbl_member where userid='" + userid + "'";
		
		try
		{
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			if (rs.next())
				result = rs.getInt(1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			rsRelease(conn, pstmt, rs);
		}
		
		return result;
	}
	
	// 우편번호 검색 멧드
	public List<ZipcodeVO> zipcodeList(String addr)
	{
		Connection 			conn = null;
		PreparedStatement 	pstmt = null;
		ResultSet			rs = null;
		String 				query;
		List<ZipcodeVO> 	list = null;
		
		query = "select * from zipcode "
				+ "where (zipcode || sido || gugun || dong || bunji) "
				+ "like '%" + addr.replaceAll(" ", "") + "%'";
		
		try
		{
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			
			if (rs.next())
			{
				ZipcodeVO vo;
				
				list = new ArrayList<ZipcodeVO>();
				
				do
				{
					list.add(vo = new ZipcodeVO());
					
					vo.setZipcode(rs.getString("zipcode"));
					vo.setSido(rs.getString("sido"));
					vo.setGugun(rs.getString("gugun"));
					vo.setDong(rs.getString("dong"));
					vo.setBunji(rs.getString("bunji"));
					
					list.add(vo);
				} 
				while (rs.next());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			rsRelease(conn, pstmt, rs);
		}
		
		return list;
	}
	
	// 회원 전체 목록 검색 메소드
	public List<MemberVO> memberList(String t, String qr)
	{
		Connection 			conn = null;
		PreparedStatement 	pstmt = null;
		ResultSet			rs = null;
		String 				query;
		List<MemberVO>		list = null;
		MemberVO 			vo = null;
		
		query = "select * from tbl_member";
		
		if (null != t && t.equals("nm"))
			query += " where name like '%" + qr + "%'";
		
		query += " order by idx";
		
		try
		{
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			if (rs.next())
			{
				list = new ArrayList<MemberVO>();
				
				do
				{
					vo = new MemberVO();
					
					vo.setIdx(rs.getInt("idx"));
					vo.setName(rs.getString("name"));
					vo.setUserid(rs.getString("userid"));
					vo.setPasswd(rs.getString("passwd"));
					vo.setGubun(rs.getString("gubun"));
					vo.setTel(rs.getString("tel"));
					vo.setEmail(rs.getString("email"));
					vo.setJob(rs.getString("job"));
					vo.setIntro(rs.getString("intro"));
					vo.setFirst_time(rs.getString("first_time"));
					vo.setLast_time(rs.getString("last_time"));
					
					list.add(vo);
					
				}while (rs.next());
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			rsRelease(conn, pstmt, rs);
		}
		
		return list;
	}
	
	// 로그인(id, pass 체크)
	public MemberVO memberLogin(String userid, String passwd)
	{
		Connection 			conn = null;
		PreparedStatement 	pstmt = null;
		ResultSet			rs = null;
		MemberVO			vo = null;
		String 				query;
		int 				result = -1;
		
		query = "select * from tbl_member where userid=?";
		
		try
		{
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if (rs.next())
			{
				vo = new MemberVO();
				vo.setUserid(rs.getString("userid"));
				
				if (rs.getString("passwd").equals(passwd))
				{
					vo.setIdx(rs.getInt("idx"));
					vo.setName(rs.getString("name"));
					vo.setPasswd(rs.getString("passwd"));
					vo.setGubun(rs.getString("gubun"));
					vo.setZipcode(rs.getString("zipcode"));
					vo.setAddr1(rs.getString("addr1"));
					vo.setAddr2(rs.getString("addr2"));
					vo.setTel(rs.getString("tel"));
					vo.setEmail(rs.getString("email"));
					vo.setJob(rs.getString("job"));
					vo.setIntro(rs.getString("intro"));
					vo.setFavor(rs.getString("favorite"));
					vo.setFirst_time(rs.getString("first_time"));

					rsRelease(null, pstmt, rs);
					
					pstmt = conn.prepareStatement("update tbl_member set last_time=sysdate where userid='" + userid + "'");
					result = pstmt.executeUpdate() == 1 ? 1 : -1;
				}
			}
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			rsRelease(conn, pstmt, rs);
		}
		
		return vo;
	}
	
	// id 또는 기본키에 해당하는 회원 정보 검색 메소드
	
	// 회원정보 수정 메소드
	public boolean memberModify(MemberVO vo)
	{
		Connection 			conn = null;
		PreparedStatement 	pstmt = null;
		String 				query;
		boolean 			result = false;
		
		query = "update tbl_member "
				+ "set name=?, passwd=?, gubun=?, zipcode=?, "
				+ "addr1=?, addr2=?, tel=?, email=?, job=?, intro=?, favorite=? "
				+ "where userid=?";
		
		try
		{
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPasswd());
			pstmt.setString(3, vo.getGubun());
			pstmt.setString(4, vo.getZipcode());
			pstmt.setString(5, vo.getAddr1());
			pstmt.setString(6, vo.getAddr2());
			pstmt.setString(7, vo.getTel());
			pstmt.setString(8, vo.getEmail());
			pstmt.setString(9, vo.getJob());
			pstmt.setString(10, vo.getIntro());
			pstmt.setString(11, vo.getFavor());
			pstmt.setString(12, vo.getUserid());
			
			result = pstmt.executeUpdate() != 0;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			rsRelease(conn, pstmt, null);
		}
		
		return result;
	}
	
	
}
