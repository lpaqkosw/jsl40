package customer.view;

import java.util.List;
import java.util.Scanner;

import customer.model.CustomerDAO;
import customer.model.CustomerVO;

public class UI {
	Scanner s = new Scanner(System.in);
	
	public void m1() throws Exception {
		CustomerDAO dao = new CustomerDAO();
		List<CustomerVO> list = dao.getList();
		if(list.size()==0) {
			System.out.println("no rows");
		}
		else {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}			
		}
		while(true) {
			System.out.println("\nPress Enter to Continue.");
			String str = s.nextLine();
			if(str.equals("")) {
				break;
			}
		}
	}
	
	public void m2() {
		CustomerDAO dao = new CustomerDAO();
		String yn = dao.insertCustomer(s);
		while(true) {
			System.out.println("\nPress Enter to Continue.");
			String str = s.nextLine();
			if(str.equals("")) {
				break;
			}
		}
	}
	
	public void m3() throws Exception{
		CustomerDAO dao = new CustomerDAO();
		List<CustomerVO> list = dao.searchCustomer(s);
		if(list.size()==0) {
			System.out.println("no rows");
		}
		else {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}			
		}
		
		while(true) {
			System.out.println("\nPress Enter to Continue.");
			String str = s.nextLine();
			if(str.equals("")) {
				break;
			}
		}
	}
	
	public void m4() throws Exception{
		CustomerDAO dao = new CustomerDAO();
		String yn = dao.updateCustomer(s);
		while(true) {
			System.out.println("\nPress Enter to Continue.");
			String str = s.nextLine();
			if(str.equals("")) {
				break;
			}
		}
		
	}
	
	public void m5() throws Exception{
		CustomerDAO dao = new CustomerDAO();
		String yn = dao.deleteCustomer(s);
		while(true) {
			System.out.println("\nPress Enter to Continue.");
			String str = s.nextLine();
			if(str.equals("")) {
				break;
			}
		}
	}
	
	public String m6() {
		System.out.println("Exit(y/n)?: ");
		String yn = s.next();
		s.nextLine();
		return yn;
	}
}
