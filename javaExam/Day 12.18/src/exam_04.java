import java.util.Scanner;

/*  ��ȣ, �̸�, ���� ����, ���� ������ Ű����� �Է�
 * 		����, ���(�Ҽ����� 3��° �ڸ����� �ݿø�)
 * 
 * 
 */
public class exam_04 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		123.456
		System.out.print("��ȣ");
		int num = s.nextInt();
		
		System.out.print("�̸�");
		String name = s.next();
	
		System.out.print("��");
		int k = s.nextInt();
		
		System.out.print("��");
		int e = s.nextInt();
		
		System.out.print("��");
		int m = s.nextInt();
		
		int tot = k+e+m;
		double ave = tot/3.;
		
		ave=  (int)((tot/3)*10+0.5)/10;
		ave=  (int)((tot/3)*100+0.5)/100;
		
		
		System.out.println("��ȣ :"+num);
		System.out.println("�̸� :"+name);
		System.out.println("�հ� :"+tot);
		System.out.println("��� :"+ave);
		
		
	}
}
