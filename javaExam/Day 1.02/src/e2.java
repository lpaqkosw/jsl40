import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {
		
	}

	 Scanner scn= new Scanner (System.in);
	 int sum=0;
	 int errcnt=0;
	 int cnt=0;
	 int var;
	 
	 do	{
		 
		 System.out.print("입력자료:");
		 
		 var = scn.nextlnt();
		 totcnt++;
		 if(var>=1 && var<=100)	{
			 if var%7==0	{
				 sum+=var;
				 cnt++;
				 
			 }
		 }else	{
			 System.out.print("입력오류");
			 errcnt++;
			 
		 }
			 
	 }while(totcnt<20);
	 
	 System.out.println("sum"+sum);
	 System.out.println("average+"+sum/cnt);
	
}
