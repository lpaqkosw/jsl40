import java.util.Scanner;

/*  번호, 이름, 국어 영어, 수학 점수를 키보드로 입력
 * 		총점, 평균(소수이하 3번째 자리에서 반올림)
 * 
 * 
 */
public class exam_04 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		123.456
		System.out.print("번호");
		int num = s.nextInt();
		
		System.out.print("이름");
		String name = s.next();
	
		System.out.print("국");
		int k = s.nextInt();
		
		System.out.print("영");
		int e = s.nextInt();
		
		System.out.print("수");
		int m = s.nextInt();
		
		int tot = k+e+m;
		double ave = tot/3.;
		
		ave=  (int)((tot/3)*10+0.5)/10;
		ave=  (int)((tot/3)*100+0.5)/100;
		
		
		System.out.println("번호 :"+num);
		System.out.println("이름 :"+name);
		System.out.println("합계 :"+tot);
		System.out.println("평균 :"+ave);
		
		
	}
}
