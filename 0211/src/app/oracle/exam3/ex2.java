package app.oracle.exam3;

import java.util.List;
import java.util.Scanner;

import app.oracle.dao.EmpDAO;
import app.oracle.dto.EmpVO;

public class ex2 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		System.out.print("dno: ");
		int dno = s.nextInt();
		System.out.print("job: ");
		String job = s.next().toUpperCase();
		
		List<EmpVO> list= dao.getEmpByDnoOrJob(dno, job);
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		if(list.size()==0) {
			System.out.println("no rows");
		}

	}

}
