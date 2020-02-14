package exam;

import java.util.Scanner;

import view.UI;

public class ex {

	public static void main(String[] args) throws Exception {
		UI ui = new UI();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("menu: ");
			System.out.println("1. list");
			System.out.println("2. insert");
			System.out.println("3. select");
			System.out.println("4. update");
			System.out.println("5. delete");
			System.out.println("6. exit");
			int menu = s.nextInt();
			switch (menu) {
				case 1: {
					ui.m1();
					break;
				}
				case 2:{
					ui.m2(s);
					break;
				}
				
				case 3:{
					ui.m3(s);
					break;
				}
				case 4:{
					ui.m4(s);
					break;
				}
				case 5:{
					ui.m5(s);
					break;
				}
				case 6:{
					ui.m6();
					break;
				}
			}
			if(menu == 6) {
				break;
			}
		}
		
	}
}
