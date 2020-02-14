package app.oracle.exam2;

import java.util.List;

import app.oracle.dao.EmpDAO;
import app.oracle.dto.DeptVO;
import app.oracle.dto.EmpVO;

public class ex1 {
    public static void main(String[] args) throws Exception {
        EmpDAO dao = new EmpDAO();
        List<DeptVO> list = dao.deptList();
        if (list.size() == 0) {
            System.out.println("no rows");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

        List<EmpVO> list2 = dao.empList();
        if (list.size() == 0) {
            System.out.println("no rows");
        } else {
            for (int i = 0; i < list2.size(); i++) {
                System.out.println(list2.get(i));
            }
        }
    }
}