import java.util.Scanner;

/*  ��ȣ, �̸�, ���� ����, ���� ������ Ű����� �Է�
 * 		����, ���(�Ҽ����� �ι�° �ڸ����� �ݿø�)
 * 
 * 
 */
public class exam_3 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("��ȣ");
		int bun = s.nextInt();
		System.out.print("�̸�");
		String name =s.next();
		
		System.out.print("����");
		int kor = s.nextInt();
		System.out.print("����");
		int eng = s.nextInt();
		System.out.print("����");
		int mat = s.nextInt();

		
		int tot = kor+eng+mat;
		double ave = tot/3.;
		ave = ((int)(ave*10+0.5))/10. ;    //87.3
		
		
		System.out.println("��ȣ : " + bun);
		System.out.println("�̸� : " + name);
		System.out.println("�հ� : " + tot);
		System.out.println("��� : " + ave);
		
	}

}
