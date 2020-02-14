package customer;

import java.util.Scanner;

import customer.view.UI;

public class CustomerMain {

	public static void main(String[] args) throws Exception {
		UI ui = new UI();
		Scanner s = new Scanner(System.in);
		while(true) {
		String yn = null;
		System.out.println("==================================================");
		System.out.println("=               고객관리 프로그램 Ver 1.0             =");
		System.out.println("==================================================");
		System.out.println("[1] List All Customers");
		System.out.println("[2] New Customer(insert)");
		System.out.println("[3] Search Customer(select)");
		System.out.println("[4] Update Customer(update)");
		System.out.println("[5] delete Customer(delete)");
		System.out.println("[6] Exit");
		System.out.println("--------------------------------------------------");
		System.out.print("Choose Menu: ");
		int option = s.nextInt();
		System.out.println("==================================================");
			switch(option) {
				case 1:{
					ui.m1();
					break;
				}
			
				case 2:{
					ui.m2();
					break;
				}
			
				case 3:{
					ui.m3();
					break;
				}
			
				case 4:{
					ui.m4();
					break;
				}
			
				case 5:{
					ui.m5();
					break;
				}
				case 6:{
					yn = ui.m6();
					break;
				}
			}
			if(option == 6 && yn.equals("y")) break;
		}
		

	}

}
