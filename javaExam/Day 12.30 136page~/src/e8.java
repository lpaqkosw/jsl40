import java.util.Scanner;

/* �� ���� ���� �� ��
 * �� ���� ���� �� ��
 */
public class e8 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("����1:");
		int a = scn.nextInt();
		System.out.print("����2:");
		int b = scn.nextInt();
		System.out.print("����3:");
		int c = scn.nextInt();

		int max=0; //���� ū �� ����
		if (a>b)	{
			if (a>c)	 max=a;
			else		 max=c;
		}
		
		else 		{
			if (a>c)	max=a;
			else 		max=c;
		}
		System.out.println("max="+max);
	}
	
}