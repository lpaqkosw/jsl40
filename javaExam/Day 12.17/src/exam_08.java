import java.util.Scanner;

/* ��ȣ, �̸�, ��������, ��������, ����������
 * �Է¹޾Ƽ� ����, ��� ����Ͽ� ���
 */
public class exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("��ȣ : ");
		int bun = scn.nextlnt();
		
		System.out.print("�̸� :");
		string irum = scn.Next();
		
		
		System.out.print("�������� :");
		int kor = scn.nextlnt();
		
		System.out.print("�������� :");
		int eng = scn.nextlnt();
		
		System.out.print("�������� :");
		int mat = scn.nextlnt();
		
		
		int tot = kor+eng+mat;			// �������
		double ave = tot/3.;			//��հ��
		
		System.out.println(" ��ȣ\t�̸�\t����\t���");
		System.out.println(bun+"\t"+irum"\t"+tot+"\t"+ave);
		
		
	}

}
