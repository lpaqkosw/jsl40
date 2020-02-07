import java.util.Scanner;



/* 		문자열 처리("") 및 자료형입력
 * 		문자열 처리 : String 클래스
 * 		자료형 처리 : Scanner 클래스
 * 
 * 
 */
public class exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scn = new Scanner (System.in);
		System.out.print("이름을 입력하세요");
		String name = scn.next();//nextlnt()-정수, nextDouble()-실수
		System.out.print("이름 : " + name);
		
		char ch = 'A';
			string str = "홍길동" ;
			System.out.print("이름 : " + str);

	}

}
