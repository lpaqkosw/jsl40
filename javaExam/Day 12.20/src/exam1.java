/* 반복문
 * for (초기값 : 조건식 ; 증감식 {}
 * while(조건식){}
 * 
 * 
 */
public class exam1 {

	public static void main(String[] args) {
//1~10까지 합계
				int sum = 1+2+3+4+5+6+7+8+9+10;
				
				
/*			int sum = 1;
				sum = sum+2;
				sum = sum+3;
				.  .
				sum = sum+10;
*/
				
				
				System.out.println("1~10합:" +sum);
				
				int tot=0;
				for(int i=1; i<=10;i++) {
					System.out.println(i);
					tot = i;
				}
				System.out.println("tot=" + tot);
	}
}
