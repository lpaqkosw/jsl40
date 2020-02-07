/*
 * 1~100梱雖 礎熱м
 * while()
 */
public class exam5 {

	public static void main(String[] args) {

		int i=0, evenTot1=0;
		while(true)	{
			i=i+2;
			evenTot1 +=i;
			if(i==10) {
				break;
		}
			
		System.out.println("1~100 礎熱м:" + evenTot1);
		i=0;
		evenTot1=0;
		while(i<=100)	{
			i+=2;
			evenTot1+=i;
		}
		System.out.println("2:1~100 礎熱м:" + evenTot1);
		i=0;
		evenTot1=0;
		while(true)	{
			i++;
			if(i%2==0) {
			evenTot1+=i;
			}
			if(i==0) {
				break;
			}
		System.out.println("3:1~100 礎熱м :" + evenTot1);
	}
		
	}
}
