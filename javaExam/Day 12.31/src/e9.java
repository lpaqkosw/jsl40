import java.util.Scanner;

/*	keyboard input
 * 	50~90  input	10 things     output sum
 */
public class e9{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int sum=0;
		int count=0;
		int var;
		System.out.print("50~90 사이의 정수:");
		
		
		while(count<10) {
			
			var= scn.nextInt();
		if(var<90 && var>50)	{
			sum+=var;
			count++;
			
			
		}
		System.out.println("sum :" +sum);
	}
}
}