import java.util.Scanner;

/* 세 개의 정수 중 대,	중,	소
 * 조건연산자 (조건식)? 참 : 거짓;
 */
public class e14	{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수1:");
		int a = scn.nextInt();
		System.out.print("정수2:");
		int b = scn.nextInt();
		System.out.print("정수3:");
		int c = scn.nextInt();

		int max=-9999999, medium=b, min=9999999;
		if(a>b)	{
			if(a>c)	{
				max=a;
					if(b>c)
						{medium=b; min=c;}
					else
						{medium=c; min=b;}
		}	

			

		//출력
			

		}
		else if(a<b)
	{ //a<b
		if(b>c)	{
			max=b;
				if(a>c)
					{medium=a; min=c;}
				else
					{medium=c; min=a;}
				
			}	
		
	}
		else {
			
			max = c;
				if(a>c)
				{medium=a; min=c;}
				else
				{medium=c; min=a;}
			
		}
		System.out.print("정수1:"+a+"\t");
		System.out.print("정수2:"+b+"\t");
		System.out.print("정수3:"+c+"\t");
		System.out.print("중앙값:"+medium+"medium");
		
	}
}	

		

