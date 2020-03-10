package view;


import java.util.List;
import java.util.Scanner;

import dao.CustDAO;
import vo.CustVO;

public class View {
	Scanner s = new Scanner(System.in);
	CustDAO dao = new CustDAO();
	public void run() throws Exception {
		while(true) {
			
			System.out.println("\n쇼핑몰 회원 관리 프로그램");
			System.out.println("[1]회원정보 등록");
			System.out.println("[2]회원정보현황 조회");
			System.out.println("[3]회원정보 수정");
			System.out.println("[4]회원정보 삭제");
			
			System.out.println("\n메뉴를 선택하세요(1~4): ");
			Integer mn;
			while(true) {
				mn = s.nextInt();s.nextLine();
				if(mn > 0 && mn <5) {
					break;
				}
			}
			
			switch(mn) {
			case 1:{
				dao.insertCust(s);
				break;
			}
			case 2:{
				System.out.println();
				List<CustVO> list = dao.listAll();
				if(list.size()!=0) {
					System.out.println("회원번호\t이름\t연락처\t\t성별\t가입일자\t\t회원등급");
				}
				for(int i =0; i < list.size();i++) {
					System.out.println(list.get(i));
				}
				System.out.println();
				String enter;
				System.out.println("엔터를 눌러주세요");
				while(true) {
					enter = s.nextLine();
					if(enter.equals("")) {
						break;
					}
				}
				break;
			}
			case 3:{
				dao.updateCust(s);
				break;
			}
			case 4:{
				dao.deleteCust(s);
				break;
			}
			
			}
			continue;
		}
		
		
	}
}
