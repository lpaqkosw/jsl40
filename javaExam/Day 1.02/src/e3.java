import java.util.Scanner;

/*	valet parking cost calculating program 
 * 	input car number, parking time 
 * 	car number : 1234
 * 	parking time :42
 * 	get cost and represent
 * 	parking time should be less than 24 hours
 * 	less than 10 minute : free	
 * 	10~30 minute : 500 won 
 * 	after that +500 won in every 10 minute
 *  cost <= 30000 won
 */
public class e3 {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner (System.in);
		
		int cost;
		int number;
		int time;
	
		System.out.print("number ");
		number= scn.nextInt();
		
		System.out.print("time ");
		time= scn.nextInt();
		
		if(time<=10)
			cost=0;
		
		else if (time<=30)
			cost=500;
		
		else if(time<620)
			cost=((time+9)/10)*500-1000;
		
		else
			cost=30000;
		/*
		 * �� �ܷ� else ��ſ� �ٱ� ���η� if(cost<30000); ���� ����
		 * 
		 */
		
		 System.out.print("car number "+ number);
		 System.out.print("\t cost "+cost); System.out.print(" won");
			
	}

}