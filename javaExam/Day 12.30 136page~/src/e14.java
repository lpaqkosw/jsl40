import java.util.Scanner;

/* �� ���� ���� �� ��,	��,	��
 * ���ǿ����� (���ǽ�)? �� : ����;
 */
public class e14	{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("����1:");
		int a = scn.nextInt();
		System.out.print("����2:");
		int b = scn.nextInt();
		System.out.print("����3:");
		int c = scn.nextInt();

		int max=-9999999, medium=b, min=9999999;
		if(a>b)	{
			if(a>c)	{
				max=a;
					if(b>c)
						{medium=b; min=c;}
					else
						{medium=c; min=b;}
		}	

			

		//���
			

		}
		else if(a<b)
	{ //a<b
		if(b>c)	{
			max=b;
				if(a>c)
					{medium=a; min=c;}
				else
					{medium=c; min=a;}
				
			}	
		
	}
		else {
			
			max = c;
				if(a>c)
				{medium=a; min=c;}
				else
				{medium=c; min=a;}
			
		}
		System.out.print("����1:"+a+"\t");
		System.out.print("����2:"+b+"\t");
		System.out.print("����3:"+c+"\t");
		System.out.print("�߾Ӱ�:"+medium+"medium");
		
	}
}	

		
