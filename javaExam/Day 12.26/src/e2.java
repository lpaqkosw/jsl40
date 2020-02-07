/*	표준입력
 *  System.in.read();--1문자입력--정수로 변환
 *	예외처리 필수 
 */
public class e2 {

	public static void main(String[] args)	throws Exception1 {
		System.out.print("1문자 입력:");
		System.in.read();
		System.in.read();		//A--ASCII Code 10 13 65 98 번
		int ch = System.in.read();
		System.out.println("ch" +ch);

	}

}
