/* if ()
 * switch ~ case
 * 
 */
public class e2 {

	public static void main(String[] args) {
		int var=45;
		String str="";		//String : ���ڿ� ó����
		switch(var/10)	{		//���� or ���� (����, ����, ���ڿ�)
			case 10:		//��(����,����,���ڿ�)
				System.out.println('A');	;
				break;
			case 9:
				System.out.println('B');	
				break;
			case 8:
				System.out.println('C');	
				break;
			case 7:
				System.out.println('D');	
				break;			
			case 6:
				System.out.println('E');	
				break;
			default :
				System.out.println('F');	
		}

	}
}