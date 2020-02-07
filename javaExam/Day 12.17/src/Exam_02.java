/* 기본 자료형(문자:char, 정수:int, 실수:double)
 * shsfl(boolean)
 * 
 */
public class Exam_02 {
	public static void main(String[] args)	{
		char ch;	//2자/bye
		int jung;	//4자
		double dou;	//8자
		boolean bool;	//1자
		
		ch='s'; //대입연산자 - 1문자대입
		jung=345678;	//정수대입
		dou=3.141592;//실수대입
		bool=true;//true(참)대입
		
		System.out.println("char ch="	+	ch);
		System.out.println("int jung=" + jung);
		System.out.println("double dou=" +dou);
		System.out.println("boolean bool=" + bool);
	}
}
