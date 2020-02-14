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
 * 
 */
public class ex1 {

	public static void main(String[] args) throws Exception {
		DDLDAO ddldao = new DDLDAO();
		int row = ddldao.tabCreate();
		if(row ==-1) {
			System.out.println("failed");
			System.out.println("rows: "+row);
		}
		else {
			System.out.println("success");
		}

	}

}
