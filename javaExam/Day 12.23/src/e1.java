/* 배열처리 : 동일한 이름을 가진 기억장소의 이름(아파트) 
 * 배열명 (이름) , 인덱스(첨자)==>a[1]
 */
public class e1 {

	public static void main(String[] args) {
		//배열선언
		int a;  // a=변수선언-> 4byte
		a=0;
		System.out.println("a=" + a);
		int var[];  //var 배열변수 선언
		var = new int[10];//할당 ( 실제 메모리 구성 )
		
		
		//var -> 첫번째 요소의 주소
		System.out.println("var = " + var); //첫번 요소 주소
		System.out.println("var[0] = " + var[0]); //요소 값[0]
	}

}
