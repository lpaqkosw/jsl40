
public class exam2 {

	public static void main(String[] args) {
		int i=0; //1 2 3 4 5
		int tot=0; // 1+2+3+
		while(true)	{
			
			i++;
			tot=tot+1;
			System.out.println(i);
			if(i==100) {
				break;		//반복문 종료
			}
			System.out.println("1~100:" + tot);
		}
		
		
	}

}
