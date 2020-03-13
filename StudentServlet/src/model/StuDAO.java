package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBCon;

public class StuDAO {
	DBCon db = DBCon.getInstance();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public int insertStu(StuVO vo) {
		String sql = "insert into tbl_score_001 values(?,?,?,?,?,?,?)";
		int row = 0;
		try {
			conn = db.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getBun());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getSex());
			ps.setInt(4, vo.getKor());
			ps.setInt(5, vo.getEng());
			ps.setInt(6, vo.getMat());
			ps.setString(7, vo.getRegdate());
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
	
	public List<StuVO> listStu(){
		String sql = "select * from tbl_score_001";
		List<StuVO> list = new ArrayList<StuVO>();
		try {
			conn = db.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				StuVO vo = new StuVO();
				vo.setBun(rs.getInt("bun"));
				vo.setEng(rs.getInt("eng"));
				vo.setKor(rs.getInt("kor"));
				vo.setMat(rs.getInt("mat"));
				vo.setName(rs.getString("name"));
				vo.setRegdate(rs.getString("regdate"));
				if(rs.getString("gender").equals("M")) {
					vo.setSex("남자");
				}
				else {
					vo.setSex("여자");
				}
				
				vo.setTot(vo.getEng()+vo.getKor()+vo.getMat());
				vo.setAvg(Math.round((vo.getTot()/3.0)*100)/100.0);
				switch((int)vo.getAvg()/10){
				case 10:
				case 9:{
					vo.setGrade("수");
					break;
				}
				case 8:{
					vo.setGrade("우");
					break;
				}
				case 7:{
					vo.setGrade("미");
					break;
				}
				case 6:{
					vo.setGrade("양");
					break;
				}
				default:{
					vo.setGrade("가");
				}
				}
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
