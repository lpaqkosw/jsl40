import java.util.Scanner;

/* 세 개의 정수 중 대
 * 세 개의 정수 중 소
 */
public class e8 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수1:");
		int a = scn.nextInt();
		System.out.print("정수2:");
		int b = scn.nextInt();
		System.out.print("정수3:");
		int c = scn.nextInt();

		int max=0; //가장 큰 값 저장
		if (a>b)	{
			if (a>c)	 max=a;
			else		 max=c;
		}
		
		else 		{
			if (a>c)	max=a;
			else 		max=c;
		}
		System.out.println("max="+max);
	}
	
}
