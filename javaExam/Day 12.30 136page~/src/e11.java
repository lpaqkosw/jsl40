import java.util.Scanner;

/* �� ���� ���� �� ��
 * �� ���� ���� �� ��
 * ���ǿ����� (���ǽ�)? �� : ����;
 */
public class e11
{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("����1:");
		int a = scn.nextInt();
		System.out.print("����2:");
		int b = scn.nextInt();
		System.out.print("����3:");
		int c = scn.nextInt();

		int max= (a>b)? a : b ;
		max=(max<c)?	c : max;
		
		
	}
}
