import java.util.Scanner;

/* �� ���� ���� �� ��,	��,	��
 * ���ǿ����� (���ǽ�)? �� : ����;
 */
public class e13	{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("����1:");
		int a = scn.nextInt();
		System.out.print("����2:");
		int b = scn.nextInt();
		System.out.print("����3:");
		int c = scn.nextInt();

		if(a<b)	{
			int imsi=a;
			a=b;
			b=imsi;
		}
		if(a<c)	{
			int imsi=a;
			a=c;
			c=imsi;
		}
		if(b<c)	{
			int imsi=a;
			b=c;
			c=imsi;
		}
	}	
}
		

