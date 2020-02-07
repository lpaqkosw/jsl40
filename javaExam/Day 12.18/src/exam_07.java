/*
 * 비트 연산자
 * << (이동연산자) >>   &(and)  |(or)  ^(xor) ~(보수, not) 
 */
public class exam_07 {

	public static void main(String[] args) {
	//        10>>2  10<<3  10&4  10|5  10^5  ~10
	//	byte(1) char(2) int(4)  1 byte=8 bit  

		
		System.out.println("3<<1" + (2<<1));
		System.out.println("3<<2" + (2<<2));
		System.out.println("3<<3" + (2<<3));
		System.out.println("3<<4" + (3<<4));

	}
}