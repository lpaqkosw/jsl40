import java.util.Scanner;

/* �� ���� ���� �� ��,	��,	��
 * ���ǿ����� (���ǽ�)? �� : ����;
 */
public class e12	{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("����1:");
		int a = scn.nextInt();
		System.out.print("����2:");
		int b = scn.nextInt();
		System.out.print("����3:");
		int c = scn.nextInt();

		int medium=0;
			if(a>b)	{
				if(b>c)	
					medium=b;
				else if(b<c)
						{if(a>c) medium=c; else if(a<c) medium=a;}
			}	
			
			if(a<b)	{
				if(b<c)	
					medium=b;
				else if(b>c)
						{if(a>c) medium=a; else if(a<c) medium=c;}
			}	
			
			//System.out.println("max=" + max);
			System.out.println("medium=" + medium);
			//System.out.println("min=" +min);	
	}
}	

		
