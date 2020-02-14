package exam2;

import dao.DDLDAO;

//delete:
//DELETE FROM table_name WHERE condition
//DELETE FROM aaa WHERE dno =10;
public class ex4 {
	public static void main(String[] args) throws Exception{
		int dno = 10;
		
		DDLDAO dao = new DDLDAO();
		int row = dao.aaaDelete(dno);
		if(row == 0) {
			System.out.println("failed");
		}
		else {
			System.out.println("success");
			System.out.println(row);
		}
	}
}
