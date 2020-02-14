package exam;

import java.util.List;

import dao.DataDAO;
import dto.EmpVO;

public class ex2 {

	public static void main(String[] args) throws Exception {
		DataDAO dao = new DataDAO();
		List<EmpVO> list = dao.s2();
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i).getEname()+"\t"+list.get(i).getSalary()+"\t"+list.get(i).getWild());
		}
		if(list.isEmpty()) {
			System.out.println("empty");
		}

	}

}
