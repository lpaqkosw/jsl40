package customer.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import customer.db.DBManager;

public class CustomerDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<CustomerVO> getList() throws Exception{
		String query = "select * from custom";
		List<CustomerVO> list = new ArrayList<CustomerVO>();
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			CustomerVO customer = new CustomerVO();
			customer.setNum(rs.getInt("num"));
			customer.setName(rs.getString("name"));
			customer.setTel(rs.getString("tel"));
			customer.setAddr(rs.getString("addr"));
			customer.setOffice(rs.getString("office"));
			customer.setBirthday(rs.getString("birthday"));
			customer.setSex(rs.getString("sex"));
			customer.setIndate(rs.getString("indate"));
			list.add(customer);
		}
		
		pstmt.close();
		conn.close();
		
		return list;
	}
	
	public String insertCustomer(Scanner s) {
		System.out.println("Enter New Customer Info..");
		System.out.print("Num: ");
		int num = s.nextInt();
		System.out.print("Name: ");
		String name = s.next().toUpperCase();
		System.out.print("Tel: ");
		String tel = s.next().toUpperCase();
		System.out.print("Addr: ");
		String addr = s.next().toUpperCase();
		System.out.print("Office: ");
		String office = s.next().toUpperCase();
		System.out.print("Birthday: ");
		String birthday = s.next().toUpperCase();
		System.out.print("sex: ");
		String sex = s.next().toUpperCase();
		s.nextLine();
		
		System.out.print("Insert Customer(y/n)? : ");
		String yn = s.next();
		s.nextLine();
		if(yn.equalsIgnoreCase("n")) {
			System.out.println("canceled.");
			return "f";
		}
		else {
			String query = "insert into custom(num,name,tel,addr,office,birthday,sex) values(?,?,?,?,?,?,?)";
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, num);
				pstmt.setString(2,name);
				pstmt.setString(3, tel);
				pstmt.setString(4, addr);
				pstmt.setString(5, office);
				pstmt.setString(6, birthday);
				pstmt.setString(7, sex);
			
				pstmt.execute();
			
				pstmt.close();
				conn.close();
				System.out.println("success");
				return "s";
			}
			catch(Exception e) {
				e.printStackTrace();
				return "f";
			}
		}
	}
	
	public List<CustomerVO> searchCustomer(Scanner s) throws Exception{
		System.out.print("search name?: ");
		String name = s.next().toUpperCase();
		s.nextLine();
		List<CustomerVO> list = new ArrayList<CustomerVO>();
		String query = "select * from custom where name=?";
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1,name);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			CustomerVO customer = new CustomerVO();
			customer.setNum(rs.getInt("num"));
			customer.setName(rs.getString("name"));
			customer.setTel(rs.getString("tel"));
			customer.setAddr(rs.getString("addr"));
			customer.setOffice(rs.getString("office"));
			customer.setBirthday(rs.getString("birthday"));
			customer.setSex(rs.getString("sex"));
			customer.setIndate(rs.getString("indate"));
			list.add(customer);
		}
		
		pstmt.close();
		conn.close();
		
		return list;
	}
	
	public String updateCustomer(Scanner s) throws Exception{
		System.out.print("Customer num? : ");
		int num = s.nextInt();
		
		String query = "select name from custom where num =?";
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, num);
		rs = pstmt.executeQuery();
		rs.next();
		String name = rs.getString("name");
		

		System.out.println("name: "+ name);
		System.out.print("new Office: ");
		String office = s.next().toUpperCase();
		System.out.print("new tel: ");
		String tel = s.next().toUpperCase();
		System.out.println("update(y/n)? : ");
		String yn = s.next();
		s.nextLine();
		if(yn.equalsIgnoreCase("n")) {
			System.out.println("canceled.");
			return "f";
		}
		else {
			String query2 = "update custom set tel = ?, office = ? where num = ?";
			pstmt = conn.prepareStatement(query2);
			pstmt.setString(1, tel);
			pstmt.setString(2, office);
			pstmt.setInt(3, num);
			pstmt.execute();

			pstmt.close();
			conn.close();
			
			System.out.println("success");
			return "s";
		}
	}
	
	public String deleteCustomer(Scanner s) throws Exception{
		System.out.print("delete which custom(enter num)?: ");
		int num = s.nextInt();
		String query = "select * from custom where num =?";
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, num);
		rs= pstmt.executeQuery();
		rs.next();
		System.out.println("Name: "+rs.getString("name"));
		System.out.println("Tel: "+rs.getString("tel"));
		System.out.println("Addr: "+rs.getString("addr"));
		System.out.println("Office: "+rs.getString("office"));
		System.out.println("Birthday: "+rs.getString("birthday"));
		System.out.println("sex: "+rs.getString("sex"));
		System.out.println("Inday: "+rs.getString("indate"));
		
		System.out.print("Delete(y/n)? : ");
		String yn = s.next();
		s.nextLine();
		if(yn.equalsIgnoreCase("y")) {
			String query2 = "delete from custom where num = ?";
			pstmt = conn.prepareStatement(query2);
			pstmt.setInt(1, num);
			pstmt.execute();
			System.out.println("success");
			return"s";
		}
		else {
			System.out.println("canceled.");
			return"f";
		}
		
		
	}
	
}
