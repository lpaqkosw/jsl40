/*	1~10 �հ�
 * 1+2+3+4+5+6+7+8+9+10=55
 * 
 */
public class e5 {
	public static void main(String[] args)  {
		int i=0;
		int s=0;
//		do {
//			i=i+1;
//			s=s+i; 
//		} while(i<10);
//		System.out.print("sum "+s);    
		
//	while(i<10)	{
//			i++;
//		System.out.println(i);
//		s+=i;
//		}
//	System.out.print("\t sum "+s);
		
		while(true)	{
			i++;
			System.out.println(i);
			s+=i;
			if(i==10)
				break;
		}
		System.out.print("\t sum "+s);
		
	}
}