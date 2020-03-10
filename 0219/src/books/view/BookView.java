package books.view;

import java.util.List;
import java.util.Scanner;

import books.dao.BookDAO;
import books.vo.BooksVO;

public class BookView {
	public void run() throws Exception {
		Scanner s = new Scanner(System.in);
		BookDAO dao = new BookDAO();
		while(true) {
			System.out.println("\n도서대출 관리 프로그램");
			System.out.println("[1] 도서 대출 예약 등록");
			System.out.println("[2] 도서 대출 현황 조회");
			System.out.println("[3] 도서 대출 예약 수정");
			System.out.println("[4] 도서 대출 반납 등록");
			
			System.out.println("메뉴를 선택하세요 (1~4)");
			int mn;
			while(true) {
				mn = s.nextInt();s.nextLine();
				if(mn >0 && mn<5) {
					break;
				}
			}
			switch(mn) {
			case 1:{
				dao.insBookRes(s);
				break;
			}
			
			case 2:{
				List<BooksVO> list = dao.listAll();
				for(int i = 0; i < list.size();i++) {
					System.out.println(list.get(i));
				}
				break;
			}
			
			case 3:{
				dao.updateRes(s);
				break;
			}
			
			case 4:{
				dao.returnBook(s);
				break;
			}
			}
			
		}
		
	}
}
