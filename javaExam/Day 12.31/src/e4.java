/* 반복문 Repetitive Statement (while, for)
 * 1. while (조건식 conditional expression)
 * 2. do( ~ ) While (conditional expression)
 * 3. for(variable = initial value; conditional ; 증감식)
 */
public class e4 {

	public static void main(String[] args) {
		int x=0;
		while(true)	{
			System.out.println("x" +x);
			x++;
			if(x==2)	break;
		}
		
		int y=0;
		while(y<3) { 
			System.out.println("y" +y);
			y++;
		}
		
		int z=0;
		do { 
			System.out.println("z" +z);
			z++;
		} while(z==2);
	}
}
