package exam;

import java.util.List;

import dao.DataDAO;
import dto.EmpVO;

public class ex8 {

	public static void main(String[] args) throws Exception{
		DataDAO dao = new DataDAO();
		List<EmpVO> list = dao.s8();
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i).getEname()+"\t"+list.get(i).getSalary()+"\t"+list.get(i).getDno());
		}


	}

}
