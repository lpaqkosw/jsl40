package app.oracle.exam3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.oracle.dao.EmpDAO;
import app.oracle.dto.EmpVO;

public class ex {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("dno: ");
		int dno = s.nextInt();
		System.out.print("job: ");
		String job = s.next();
		s.close();
		EmpDAO dao = new EmpDAO();
		EmpVO vo = dao.selectEMP(dno, job);
		if(vo == null) {
			System.out.println("no row");
		}
		else {
			System.out.println(vo);			
		}
		
		

	}

}
