/*문제) 키보드로 1문자 입력
 *    입력된 문자를 이용해서 (*)입력된 경우
 *    			*   print("*")
 *    		   ***
 * 		   	  *****
 * 			 *******
 *			*********
 */
public class exam_06 {

	public static void main(String[] args) throws Exception 
	
	
	{
		// TODO Auto-generated method stub
		System.out.print("1문자 입력 : ");
		char c = (char)System.in.read();
		
		System.out.print("");
		System.out.print(c);
		System.out.print("\n");
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print("\n");
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print("\n");
		
	}

}
