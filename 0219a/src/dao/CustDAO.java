package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.DBManager;
import vo.CustVO;

public class CustDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement ps= null;
	ResultSet rs = null;
	
	public boolean insertCust(Scanner s) throws SQLException, ClassNotFoundException {
		while(true) {
			System.out.print("회원번호: ");
			String custnoT = s.nextLine();
			Integer custno;
			System.out.print("회원이름: ");
			String custname = s.nextLine().toUpperCase();
			System.out.print("연락처: ");
			String phone = s.nextLine();
			System.out.print("성별(M/F): ");
			String gender = s.nextLine().toUpperCase();
			System.out.print("회원등급(A/B/C): ");
			String grade = s.nextLine().toUpperCase();
			
			System.out.println("등록합니다(y/n)?: ");
			String yn;
			while(true) {
				yn = s.next();s.nextLine();
				if(yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("n")) {
					break;
				}
			}
			
			if(yn.equalsIgnoreCase("y")) {
				try {
					if(!custnoT.matches("\\d{6}")){
						System.out.println("오류: 회원번호 오류");
						throw new Exception();
					}
					custno = Integer.parseInt(custnoT);
					if(!gender.isEmpty() && ((!gender.equalsIgnoreCase("f") && !gender.equalsIgnoreCase("m")))){
						System.out.println("오류: 성별 오류");
						throw new Exception();
					}
					if(!grade.isEmpty() && (!grade.equalsIgnoreCase("a") && grade.equalsIgnoreCase("b") && grade.equalsIgnoreCase("c"))) {
						System.out.println("오류: 등급 오류");
						throw new Exception();
					}
				}
				catch(Exception e) {
					continue;
				}
				
				String sql = "insert into tbl_member_20200219 values(?,?,?,?,sysdate,?)";
				conn = manager.getConnection();
				ps = conn.prepareStatement(sql);
				ps.setInt(1, custno);
				ps.setString(2, custname);
				ps.setString(3, phone);
				ps.setString(4, gender);
				ps.setString(5, grade);
				ps.execute();
				
				System.out.println("\n회원정보가 등록되었습니다\n");
				return true;
			}
			else {
				continue;
			}
		}
	}
	
	public List<CustVO> listAll() throws Exception{
		List<CustVO> list = new ArrayList<CustVO>();
		String sql = "select custno,custname,phone,gender,to_char(joindate,'yyyymmdd') as joindate1, grade from tbl_member_20200219";
		conn = manager.getConnection();
		ps = conn.prepareStatement(sql);
		rs =ps.executeQuery();
		while(rs.next()) {
			CustVO vo = new CustVO();
			vo.setCustno(rs.getInt("custno"));
			vo.setCustname(rs.getString("custname"));
			vo.setPhone(rs.getString("phone"));
			vo.setGender(rs.getString("gender"));
			vo.setJoindate(rs.getString("joindate1"));
			vo.setGrade(rs.getString("grade"));
			list.add(vo);
		}
		if(list.size()==0) {
			System.out.println("회원 없음");
		}
		return list;
	}
	
	public boolean updateCust(Scanner s) throws Exception{
		while(true) {
			System.out.print("\n회원번호: ");
			Integer custno = s.nextInt();s.nextLine();
			String sql = "select custname,phone,gender,grade from tbl_member_20200219 where custno = ?";
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, custno);
			rs = ps.executeQuery();
			if(rs.next()) {
				String oldCustname = rs.getString("custname");
				String oldPhone = rs.getString("custname");
				String oldGender = rs.getString("gender");
				String oldGrade = rs.getString("grade");
				
				System.out.print("고객성명("+oldCustname+")");
				String newCustname = s.nextLine().toUpperCase();
				if(newCustname.equals("")) {
					newCustname = oldCustname;
				}
				System.out.print("연락처("+oldPhone+")");
				String newPhone = s.nextLine();
				if(newPhone.equals("")) {
					newPhone = oldPhone;
				}
				String newGender;
				while(true) {
					System.out.print("성별("+oldGender+")");
					newGender = s.nextLine().toUpperCase();
					if(newGender.equals("M") || newGender.equals("F") || newGender.equals("")) {
						break;
					}
					else {
						System.out.println("M, F 또는 엔터를 입력 해주세요");
					}
				}
				if(newGender.equals("")) {
					newGender = oldGender;
				}
				String newGrade;
				while(true) {
					System.out.print("회원등급("+oldGrade+")");
					newGrade = s.nextLine().toUpperCase();
					if(newGrade.equals("A") || newGrade.equals("B") || newGrade.equals("C") || newGrade.equals("")) {
						break;
					}
					else {
						System.out.println("A, B, C 또는 엔터를  입력 해주세요");
					}
				}
				if(newGrade.equals("")) {
					newGrade = oldGrade;
				}
				
				System.out.println("수정합니다(y/n)?: ");
				String yn;
				while(true) {
					yn = s.next();s.nextLine();
					if(yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("n")) {
						break;
					}
				}
				if(yn.equalsIgnoreCase("y")) {
					String sql1 = "update tbl_member_20200219 set custname = ?, phone = ?, gender = ?, grade = ? where custno = ?";
					ps = conn.prepareStatement(sql1);
					ps.setString(1, newCustname);
					ps.setString(2, newPhone);
					ps.setString(3, newGender);
					ps.setString(4, newGrade);
					ps.setInt(5, custno);
					
					ps.execute();
					
					System.out.println("회원정보가 수정되었습니다.");
					return true;
				}
				else {
					continue;
				}
			}
			else {
				System.out.println("회원 없음");
				continue;
			}
		}
	}
	
	public boolean deleteCust(Scanner s) throws Exception{
		while(true) {
			System.out.print("\n회원번호: ");
			Integer custno = s.nextInt();s.nextLine();
			String sql = "select custname, phone, gender, grade from tbl_member_20200219 where custno = ?";
			conn = manager.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, custno);
			rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("고객성명("+rs.getString("custname")+")");
				System.out.println("연락처("+rs.getString("phone")+")");
				System.out.println("성별("+rs.getString("gender")+")");
				System.out.println("회원등급("+rs.getString("grade")+")");
				
				System.out.println("삭제합니다(y/n)?: ");
				String yn;
				while(true) {
					yn = s.next();s.nextLine();
					if(yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("n")) {
						break;
					}
				}
				
				if(yn.equalsIgnoreCase("y")) {
					String sql1 = "delete from tbl_member_20200219 where custno = ?";
					ps = conn.prepareStatement(sql1);
					ps.setInt(1, custno);
					ps.execute();
					
					System.out.println("\n회원정보가 삭제되었습니다\n");
					return true;
				}
				else {
					continue;
				}
			}
			else {
				System.out.println("회원 없음");
				continue;
			}
		}
	}
}
