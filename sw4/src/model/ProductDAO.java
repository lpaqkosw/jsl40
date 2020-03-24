package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBCon;

public class ProductDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public int insertProduct(ProductVO vo) {
		String sql = "insert into product values(?,?,?,?,?,?,?)";
		int row = 0;
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getCode());
			ps.setString(2, vo.getPname());
			ps.setInt(3, vo.getCost());
			ps.setInt(4, vo.getPnum());
			ps.setInt(5, vo.getJnum());
			ps.setInt(6, vo.getSale());
			ps.setString(7, vo.getGcode());
			row = ps.executeUpdate();
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
			return row;
			
		}
	}
	
	public List<GroupVO> listGroup() {
		String sql = "select * from groupcode";
		List<GroupVO> list = new ArrayList<GroupVO>();
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			rs= ps.executeQuery();
			while(rs.next()) {
				GroupVO vo = new GroupVO();
				vo.setGcode(rs.getString("gcode"));
				vo.setGname(rs.getString("gname"));
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
	
	public ProductVO selectProduct(String code) {
		String sql = "select * from product where code = ?";
		ProductVO vo = new ProductVO();
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, code);
			rs=ps.executeQuery();
			if(rs.next()) {
				vo.setCode(rs.getString("code"));
				vo.setPname(rs.getString("pname"));
				vo.setCost(rs.getInt("cost"));
				vo.setJnum(rs.getInt("jnum"));
				vo.setPnum(rs.getInt("pnum"));
				vo.setSale(rs.getInt("sale"));
				vo.setGcode(rs.getString("gcode"));
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
			return vo;
		}
	}
	
	public int modifyProduct(ProductVO vo) {
		String sql = "update product set pname=?, cost=?, jnum=?, pnum=?, sale=?, gcode=? where code = ?";
		int row = 0;
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getPname());
			ps.setInt(2, vo.getCost());
			ps.setInt(3, vo.getJnum());
			ps.setInt(4, vo.getPnum());
			ps.setInt(5, vo.getSale());
			ps.setString(6, vo.getGcode());
			ps.setString(7, vo.getCode());
			row = ps.executeUpdate();
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
			return row;
		}
	}
	
	public int deleteProduct(ProductVO vo) {
		String sql = "delete from product where pname=? and cost=? and jnum=? and pnum=? and sale=? and gcode=? and code = ?";
		int row =0;
		try {
			conn = DBCon.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getPname());
			ps.setInt(2, vo.getCost());
			ps.setInt(3, vo.getJnum());
			ps.setInt(4, vo.getPnum());
			ps.setInt(5, vo.getSale());
			ps.setString(6, vo.getGcode());
			ps.setString(7, vo.getCode());
			row = ps.executeUpdate();
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
			return row;
		}
	}
	
}
