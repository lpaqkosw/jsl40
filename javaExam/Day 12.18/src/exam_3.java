import java.util.Scanner;

/*  번호, 이름, 국어 영어, 수학 점수를 키보드로 입력
 * 		총점, 평균(소수이하 두번째 자리에서 반올림)
 * 
 * 
 */
public class exam_3 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("번호");
		int bun = s.nextInt();
		System.out.print("이름");
		String name =s.next();
		
		System.out.print("국어");
		int kor = s.nextInt();
		System.out.print("영어");
		int eng = s.nextInt();
		System.out.print("수학");
		int mat = s.nextInt();

		
		int tot = kor+eng+mat;
		double ave = tot/3.;
		ave = ((int)(ave*10+0.5))/10. ;    //87.3
		
		
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + ave);
		
	}

}
