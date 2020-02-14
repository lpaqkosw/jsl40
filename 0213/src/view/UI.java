package view;

import java.util.List;
import java.util.Scanner;

import model.DeptDAO;
import model.DeptVO;

public class UI {
	DeptDAO dao = new DeptDAO();
	//menu 1
	public void m1() throws Exception {
		System.out.println("DNO\tDNAME\t\tLOC");
		List<DeptVO> list = dao.getList();
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		if(list.isEmpty()) {
			System.out.println("no rows");
		}
	}
	//menu 2
	
	public void m2(Scanner s){
		System.out.println("Enter dept info... ");
		System.out.print("dno: ");
		int dno = s.nextInt();
		System.out.print("dname: ");
		String dname = s.next().toUpperCase();
		System.out.print("loc: ");
		String loc = s.next().toUpperCase();
		try {
			dao.insertDept(dno, dname, loc);			
			System.out.println("success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//menu 3 - 부서번호 입력시 해당 부서 정보
	
	public void m3(Scanner s) throws Exception{
		System.out.print("Enter dno: ");
		int dno = s.nextInt();
		List<DeptVO> list = dao.selectDept(dno);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		if(list.isEmpty()) {
			System.out.println("no rows");
		}
	}
	
	//menu 4 - 부서번호, 부서명, 지역명 수정
	public void m4(Scanner s) {
		System.out.println("Enter Dept info... ");
		System.out.print("dno: ");
		int dno = s.nextInt();
		System.out.print("dname: ");
		String dname = s.next().toUpperCase();
		System.out.print("loc: ");
		String loc = s.next().toUpperCase();
		try {
			dao.updateDept(dno, dname, loc);
			System.out.println("success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//menu 5 - 부서번호를 이용한 삭제
	public void m5(Scanner s) {
		System.out.println("Delete by dno");
		System.out.println("Enter dno: ");
		int dno = s.nextInt();
		try {
			dao.deleteDept(dno);
			System.out.println("success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//menu 6
	public void m6() {
		System.out.println("Exitting...");
	}
	
	
}
