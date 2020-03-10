package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<ZipcodeVO> zipcodeList(String like){
		String sql="select * from zipcode where dong like ?";
		List<ZipcodeVO> list = new ArrayList<ZipcodeVO>();
		try {
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+like+"%");
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
	
	
}
