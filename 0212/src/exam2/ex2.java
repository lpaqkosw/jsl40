package exam2;

import dao.DDLDAO;

//ddl - create alter drop
//dml - CRUD -> Insert Select Update Delete 
//dcl - grant revoke
//tcl - commit rollback savepoint
/*
 * oracle db data types
 * number
 * char
 * varchar2
 * etc
 */

/*
 * INSERT:
 * INSERT INTO table_name (column_name, column_name.....) VALUES(column_value, column_value.....);
 * INSERT INTO aaa VALUES (10,'AAA','20200212',90);
 */
public class ex2 {

	public static void main(String[] args) throws Exception {
		DDLDAO ddldao = new DDLDAO();
		int dno = 10;
		String dname = "AAA";
		String date = "20200212";
		int score = 90;
		int row = ddldao.insertAAA(dno, dname, date, score);
		if(row <=0) {
			System.out.println("failed");
			System.out.println("rows: "+row);
		}
		else {
			System.out.println("success");
			System.out.println("rows: "+row);
		}

	}

}
