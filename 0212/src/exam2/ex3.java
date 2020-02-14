package exam2;

import dao.DDLDAO;

//update:
//UPDATE table_name SET column=value, column=value WHERE condition
public class ex3 {

	public static void main(String[] args) throws Exception{
		int dno = 10;
		String dname = "bbb";
		int score = 100;
		
		DDLDAO dao = new DDLDAO();
		int row =dao.aaaUpdate(dno, dname,score);
		if(row == 0) {
			System.out.println("failed");
		}
		else {
			System.out.println("success");
		}

	}

}
