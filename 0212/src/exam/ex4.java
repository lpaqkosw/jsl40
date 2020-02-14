package exam;

import dao.DataDAO;
import dto.EmpVO;

public class ex4 {

	public static void main(String[] args) throws Exception{
		DataDAO dao = new DataDAO();
		EmpVO emp = dao.s4();
		System.out.println(emp.getEname()+"\t"+emp.getDno());

	}

}
