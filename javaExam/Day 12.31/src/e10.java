import java.util.Scanner;

/*	keyboard input
 * 	50~90  input	10 things     output sum
 * if input is minus, output sum and terminate
 */ 
public class e10{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int sum=0;
		int count=0;
		int var;
		while(true) {
			System.out.print("50~90 ������ ����:");
			
			var= scn.nextInt();
			
				if(var<0)	{
					break;	
				}
				if(var<=90 && var>=50)	{
					sum+=var;
					count++;
			}
		}
		System.out.println("sum :" +sum);
		System.out.println("average :" +(double)sum/count);
	}
	
}