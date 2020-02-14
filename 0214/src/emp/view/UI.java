package emp.view;

import java.util.List;
import java.util.Scanner;

import emp.model.EmpDAO;
import emp.model.EmpVO;

public class UI {
    Scanner s = new Scanner(System.in);
    
	public void m1() throws Exception{
        EmpDAO dao = new EmpDAO();
		System.out.println("eno\tename\tjob\t\tmanager\thiredate\tsalary\tcommission\tdno\tdname");
		List<EmpVO> list = dao.listAllEmp();
		if(list.size()==0){
			System.out.println("no rows");
		}
		for(int i = 0; i < list.size();i++){
			System.out.println(list.get(i));
        }
        
        while(true){
            System.out.println("\nPress Enter to continue.");
            String ent = s.nextLine();
            if(ent.equals("")){
                break;
            }
        }
    }
    
    public void m2() throws Exception{
        EmpDAO dao = new EmpDAO();
        String sf = dao.insertEmp(s);
        if(sf.equals("s")){
            System.out.println("\nsuccess");
        }
        while(true){
            System.out.println("Press Enter to continue.");
            String ent = s.nextLine();s.nextLine();
            if(ent.equals("")){
                break;
            }
        }
    }

    public void m3() throws Exception{
        EmpDAO dao = new EmpDAO();
        List<EmpVO> list = dao.searchEmp(s);
        System.out.println();
        if(list.size() ==0){
            System.out.println("no rows");
        }
        else{
            System.out.println("eno\tename\tjob\tmanName\thDate\tsalary\tcommission\tdname");
            for(int i = 0; i<list.size();i++){
                StringBuilder sb = new StringBuilder();
                sb.append(list.get(i).getEno()+"\t"+list.get(i).getEname()+"\t"+list.get(i).getJob()+"\t"+list.get(i).getManagerName()+"\t"+list.get(i).getHiredate()+"\t"+list.get(i).getSalary()+"\t"+list.get(i).getCommission()+"\t\t"+list.get(i).getDname());
                System.out.println(sb.toString());
            }
        }
        while(true){
            System.out.println("\nPress Enter to continue.");
            String ent = s.nextLine();s.nextLine();
            if(ent.equals("")){
                break;
            }
        }
    }

    public void m4() throws Exception{
        EmpDAO dao = new EmpDAO();
        String sf = dao.updateEmp(s);
        if(sf.equals("s")){
            System.out.println("\nsuccess");
        }
        while(true){
            System.out.println("Press Enter to continue.");
            String ent = s.nextLine();
            if(ent.equals("")){
                break;
            }
        }
    }

    public void m5() throws Exception{
        EmpDAO dao = new EmpDAO();
        String sf = dao.deleteEmp(s);
        if(sf.equals("s")){
            System.out.println("\nsuccess");
        }
        while(true){
            System.out.println("Press Enter to continue.");
            String ent = s.nextLine();
            if(ent.equals("")){
                break;
            }
        }
    }

    public String m6() throws Exception{
        System.out.println("Exit(y/n)? : ");
        String yn = s.next();s.nextLine();
        if(yn.equalsIgnoreCase("n")){
            while(true){
                System.out.println("\ncanceled.");
                System.out.println("Press Enter to continue.");
                String ent = s.nextLine();
                if(ent.equals("")){
                    return "f";
                }
            }
        }
        else{
            return"s";
        }
    }
}


