import java.util.Scanner;

/* 세 개의 정수 중 대
 * 세 개의 정수 중 소
 * 조건연산자 (조건식)? 참 : 거짓;
 */
public class e11
{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수1:");
		int a = scn.nextInt();
		System.out.print("정수2:");
		int b = scn.nextInt();
		System.out.print("정수3:");
		int c = scn.nextInt();

		int max= (a>b)? a : b ;
		max=(max<c)?	c : max;
		
		
	}
}
