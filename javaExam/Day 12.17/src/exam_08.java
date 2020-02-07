import java.util.Scanner;

/* 번호, 이름, 국어점수, 영어점수, 수학점수를
 * 입력받아서 총점, 평균 계산하여 출력
 */
public class exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("번호 : ");
		int bun = scn.nextlnt();
		
		System.out.print("이름 :");
		string irum = scn.Next();
		
		
		System.out.print("국어점수 :");
		int kor = scn.nextlnt();
		
		System.out.print("영어점수 :");
		int eng = scn.nextlnt();
		
		System.out.print("수학점수 :");
		int mat = scn.nextlnt();
		
		
		int tot = kor+eng+mat;			// 총점계산
		double ave = tot/3.;			//평균계산
		
		System.out.println(" 번호\t이름\t총점\t평균");
		System.out.println(bun+"\t"+irum"\t"+tot+"\t"+ave);
		
		
	}

}
