
public class e2 {
	
	public static void main(String[] args) {
		int a=5, b=0;
		int aa=5, bb=0;
		
		b=a++; // 대입 후 연산
		System.out.println("aa="+ aa); 
		System.out.println("bb="+ bb); 
		
		bb=aa++; // 연산 후 대입
		System.out.println("aa="+ aa); //6
		System.out.println("bb="+ bb); //6
		
		int c=5, d=0;
		int cc=5, dd=0;
		d=c++ + 5;

		System.out.println("c="+ c); 
		System.out.println("d="+ d); 
		
		dd=++cc+ 5;

		System.out.println("cc"+ cc);
		System.out.println("dd"+ dd);
		
		
		
		
		
		
		
		
		
	}
}
