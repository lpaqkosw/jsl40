package a0103;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a;
		while(true){
			a = s.nextInt();
			if(a >=1 && a <=99){
				int sum = 0;
				for(int i = 1; i <= a;i++){
					sum +=i;
				}
				System.out.println("1~" + a+" sum :"+sum);
			}
			if (a ==0){
				break;
			}

		}

	}

}
