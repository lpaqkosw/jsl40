package books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import books.db.DBManager;
import books.vo.BooksVO;

public class BookDAO{
    DBManager manager = DBManager.getInstance();
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean insBookRes(Scanner s) throws Exception{
    	while(true) {
    		System.out.print("대출번호: ");
    		String tmp = s.nextLine();	
    		System.out.print("고객성명: ");
    		String name = s.nextLine();
    		System.out.print("연락처: ");
    		String phone = s.nextLine();
    		System.out.print("도서코드: ");
    		String bookno = s.nextLine();
    		System.out.print("대출일자: ");
    		String outdate = s.nextLine();
    		System.out.print("반납일자: ");
    		String indate = s.nextLine();
    		String status = "1";
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
    				String booknoP = "\\d{3}";
    				String resNo = "\\d{4}";
    				String outdateP = "\\d{4}(-?)\\d{2}(-?)\\d{2}";
    				if(!bookno.isEmpty() && !bookno.matches(booknoP)) {
    					throw new Exception();
    				};
    				if(!tmp.matches(resNo)) {
    					throw new Exception();
    				}
    				if(!outdate.isEmpty() && !outdate.matches(outdateP)) {
    					throw new Exception();
    				}
    				Integer.parseInt(bookno);
    				
    			}
    			catch(Exception e){
    				System.out.println("입력 오류: 다시 입력 하세요");
    				continue;
    			}
    			String sql = "insert into reservation values(?,?,?,?,?,?,?)";
    			conn = manager.getConnection();
    			ps = conn.prepareStatement(sql);
    			ps.setInt(1, Integer.parseInt(tmp));
    			ps.setString(2, name);
    			ps.setInt(3, Integer.parseInt(bookno));
    			ps.setString(4, phone);
    			if(outdate.length() > 8) {
    				outdate = outdate.replaceAll(",$", "");
    			}
    			ps.setString(5, outdate);
    			ps.setString(6, indate);	
    			if(indate != null || !indate.isEmpty() ) {
    				status ="2";
    			}
    			ps.setString(7,status);
    			try {
    				ps.execute();
    				
    			}
    			catch(Exception e) {
    				System.out.println("\n입력 오류: 대출번호가 이미 존재합니다\n");
    				continue;
    			}
    			System.out.println("도서대출 정보가 등록되었습니다");
    			
    			List<BooksVO> list = listAll();
    			for(int i = 0; i < list.size();i++) {
    				System.out.println(list.get(i));
    			}
    		}
    		else {
    			continue;
    		}
    		return true;
    	}
    }
    
    public List<BooksVO> listAll() throws Exception{
    	List<BooksVO> list = new ArrayList<BooksVO>();
    	String sql = "select lentno,custname,bookno,phone,outdate,to_char(indate,'yyyymmdd') as indate1, status from reservation";
    	conn = manager.getConnection();
    	ps = conn.prepareStatement(sql);
    	rs = ps.executeQuery();
    	while(rs.next()) {
    		BooksVO vo = new BooksVO();
    		vo.setLentno(rs.getInt("lentno"));
    		vo.setCustname(rs.getString("custname"));
    		vo.setBookno(rs.getInt("bookno"));
    		vo.setPhone(rs.getString("phone"));
    		vo.setOutdate(rs.getString("outdate"));
    		String indate = rs.getString("indate1");
    		if(indate!=null) {
    			StringBuilder sb = new StringBuilder();
    			sb.append(indate.substring(0, 4));
    			sb.append("년");
    			sb.append(indate.substring(4,6));
    			sb.append("월");
    			sb.append(indate.substring(6));
    			sb.append("일");
    			indate = sb.toString();
    		}
    		else {
    			indate = null;
    		}
    		vo.setIndate(indate);
    		list.add(vo);
    	}
    	if(list.size() == 0) {
    		System.out.println("대출 없음");
    	}
    	
    	return list;
    }
    
    public boolean updateRes(Scanner s) throws Exception{
    	while(true) {
    		System.out.print("대출번호: ");
    		Integer lentno = s.nextInt();s.nextLine();
    		String sql = "select custname,phone,bookno,outdate,to_char(indate,'yyyymmdd') as indate1 from reservation where lentno = ?";
    		conn = manager.getConnection();
    		ps = conn.prepareStatement(sql);
    		ps.setInt(1, lentno);
    		rs = ps.executeQuery();
    		if(rs.next()) {
    			String oldName = rs.getString("custname");
    			String oldPhone = rs.getString("phone");
    			Integer oldBookno = rs.getInt("bookno");
    			String oldOutdate = rs.getString("outdate");
    			String oldIndate = rs.getString("indate1");
    			System.out.print("고객성명("+oldName+"): ");
    			String newName = s.nextLine();
    			if(newName.isEmpty()) {
    				newName = oldName;
    			}
    			System.out.print("연락처("+oldPhone+"): ");
    			String newPhone = s.nextLine();
    			if(newPhone.isEmpty()) {
    				newPhone = oldPhone;
    			}
    			System.out.print("도서코드("+oldBookno+"): ");
    			String newBooknoT = s.nextLine();
    			Integer newBookno = null;
    			if(newBooknoT.isEmpty()) {
    				newBookno = oldBookno;
    			}
    			else {
    				while(!newBooknoT.matches("\\d{3}")){
    					newBooknoT = s.nextLine();
    					if(newBooknoT.matches("\\d{3}")) {
    						newBookno = Integer.parseInt(newBooknoT);
    						break;
    					}
    				}
    			}
    			
    			System.out.print("대출일자("+oldOutdate+"): ");
    			String newOutdate = s.nextLine();
    			if(newOutdate.isEmpty()) {
    				newOutdate = oldOutdate;
    			}
    			if(oldIndate == null) {
    				oldIndate = "";
    			}
    			System.out.print("반납일자("+oldIndate+"): ");
    			String newIndate = s.nextLine();
    			if(newIndate.isEmpty()) {
    				newIndate = oldIndate;
    			}

    			System.out.print("수정합니까(y/n)?: ");
    			String yn;
    			while(true) {
    				yn = s.next();s.nextLine();
    				if(yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("n")) {
    					break;
    				}
    			}
    			
    			if(yn.equalsIgnoreCase("y")) {
    				String sql1 = "update reservation set custname = ?, phone = ?, bookno = ?, outdate = ?, indate = ?, status = ? where lentno = ?";
    				ps = conn.prepareStatement(sql1);
    				ps.setString(1, newName);
    				ps.setString(2, newPhone);
    				ps.setInt(3, newBookno);
    				ps.setString(4, newOutdate);
    				ps.setString(5, newIndate);
    				String newStatus;
    				if(!newIndate.isEmpty()) {
    					newStatus = "2";
    				}
    				else {
    					newStatus = "1";
    				}
    				ps.setString(6, newStatus);
    				ps.setInt(7, lentno);
    				ps.execute();
    				System.out.println("도서대출 정보가 수정되었습니다");
    				
    				List<BooksVO> list = listAll();
    				for(int i = 0; i <list.size();i++) {
    					System.out.println(list.get(i));
    				}
    				ps.close();
    				conn.close();
    				return true;
    			}
    			else {
    				continue;
    			}
    		}
    		else {
    			System.out.println("대출없음\n");
    			continue;
    		}
    	}
    }
    
    public boolean returnBook(Scanner s) throws Exception{
    	while(true) {
    		System.out.println("대출번호: ");
    		Integer lentno = s.nextInt();s.nextLine();
    		String sql = "select custname,phone,bookno,outdate,to_char(indate,'yyyymmdd') as indate1 from reservation where lentno = ?";
    		conn = manager.getConnection();
    		ps = conn.prepareStatement(sql);
    		ps.setInt(1, lentno);
    		rs = ps.executeQuery();
    		if(rs.next() && (rs.getString("indate1")==null || rs.getString("indate1").isEmpty())) {
    			System.out.println("고객성명("+rs.getString("custname")+"): ");
    			System.out.println("연락처("+rs.getString("phone")+"): ");
    			System.out.println("도서코드("+rs.getInt("bookno")+"): ");
    			System.out.println("대출일자("+rs.getString("outdate")+"): ");
    			System.out.println("반납일자(): ");
    			
    			System.out.println("도서 반납 처리합니다(y/n)?: ");
    			String yn;
    			while(true) {
    				yn = s.next();s.nextLine();
    				if(yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("n")) {
    					break;
    				}
    			}
    			if(yn.equalsIgnoreCase("y")) {
    				String sql1 = "update reservation set indate=sysdate status = '2' where lentno = ?";
    				ps = conn.prepareStatement(sql1);
    				ps.setInt(1, lentno);
    				ps.execute();
    				
    				System.out.println("반납되었습니다. \n");
    			}
    		}
    		else {
    			System.out.println("대출번호 없음 or 이미 반납 됨.");
    			continue;
    		}
    		
    		ps.close();
    		conn.close();
    		
    		return true;
    		
    	}
    		
    }
    	
    	
}
    
