import java.util.Scanner;

/*	정수 2개 입력
 *  두 수의 차이가 10 이상이면
 *  큰수에 -5, 작은수에 +5
 */



public class e5 {

	public static void main(String[] args) {


		Scanner scn= new Scanner (System.in);
		
		System.out.print("정수1:");
		int a=scn.nextInt();
		
		System.out.print("정수2:");
		int b=scn.nextInt();
		
		int c;
		if(a>=b)	
			c=a-b;
			
		else
			c=b-a;
		
		if(c>=10)	{
			if(a>=b) 	{a=a-5;	b=b+5;}
			else 		{b=b-5;	a=a+5;}		
			
		}
		
	}

}
