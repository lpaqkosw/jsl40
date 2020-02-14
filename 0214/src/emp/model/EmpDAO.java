package emp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date; 

import emp.db.DBManager;

public class EmpDAO {
    DBManager manager = DBManager.getInstance();
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    Date date = new Date();

    public List<EmpVO> listAllEmp() throws Exception {
        List<EmpVO> list = new ArrayList<EmpVO>();
        String query = "select eno,ename,job,manager,TO_CHAR(hiredate,'yyyy-mm-dd'),salary,commission,e.dno, dname from employee e,department d where e.dno=d.dno(+)";
        conn = manager.getConnection();
        pstmt = conn.prepareStatement(query);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            try { 
                EmpVO vo = new EmpVO();
                vo.setEno(rs.getInt("eno"));
                vo.setEname(rs.getString("ename"));
                vo.setJob(rs.getString("job"));
                vo.setManager(rs.getInt("manager"));
                vo.setHiredate(rs.getString("TO_CHAR(hiredate,'yyyy-mm-dd')"));
                vo.setSalary(rs.getInt("salary"));
                vo.setCommission(rs.getInt("commission"));
                vo.setDno(rs.getInt(8));
                vo.setDname(rs.getString("dname"));
                list.add(vo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        pstmt.close();
        conn.close();

        return list;
    }

    public String insertEmp(Scanner s) throws Exception {
        System.out.print("Ename: ");
        String ename = s.next();s.nextLine();
        System.out.print("Job: ");
        String job = s.nextLine(); 
        System.out.print("Manager: ");
        String emanager = s.nextLine();
        System.out.print("HireDate: ");
        String hiredate = s.nextLine();
        System.out.print("Salary: ");
        String salary = s.nextLine();
        System.out.print("Commission: ");
        String commission = s.nextLine();
        System.out.print("Dno: ");
        String dno = s.nextLine();
        while (!(dno.equals("10") || dno.equals("20") || dno.equals("30") || dno.equals("40") || dno.equals(""))) {
            System.out.println("invalid dno");
            System.out.print("Another Dno? :");
            dno = s.nextLine();
        }
        System.out.println("\nInsert(y/n)?: ");
        String yn = s.next();
        if (yn.equalsIgnoreCase("n")) {
            System.out.println("\ncanceled.");
            return "f";
        } 
        else {
            try {
                String query = "insert into employee values(EMPLOYEE_ENO_SEQ.nextval,?,?,?,?,?,?,?)";
                conn = manager.getConnection();
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1, ename);
                pstmt.setString(2, job);
                pstmt.setString(4, hiredate);
                if(emanager.equals("")){
                    pstmt.setNull(3, Types.NULL);
                }
                else{
                    pstmt.setInt(3, Integer.parseInt(emanager));
                }
    
                if(salary.equals("")){
                    pstmt.setNull(5, Types.NULL);
                }
                else{
                    pstmt.setInt(5, Integer.parseInt(salary));
                }
                if(commission.equals("")){
                    pstmt.setNull(6, Types.NULL);
                }
                else{
                    pstmt.setInt(6, Integer.parseInt(commission));
                }
                if(dno.equals("")){
                    pstmt.setNull(7, Types.NULL);
                }
                else{
                    pstmt.setInt(7, Integer.parseInt(dno));
                }
                pstmt.execute();
    
                pstmt.close();
                conn.close();
    
                return "s";

            } 
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("\ninvalid input");
                return "f";
            }
        }
    }

    public List<EmpVO> searchEmp(Scanner s) throws Exception {
        List<EmpVO> list = new ArrayList<EmpVO>();
        conn = manager.getConnection();
        System.out.println("Enter ename?: ");
        String ename = s.next();
        String query = "select e.eno,e.ename,e.job,e.hiredate,e.salary,e.commission,d.dname,ee.ename from employee e left outer join employee ee on (e.manager = ee.eno) full outer join department d on e.dno=d.dno where e.ename = ?";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, ename);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            EmpVO vo = new EmpVO();
            vo.setEno(rs.getInt("eno"));
            vo.setEname(rs.getString("ename"));
            vo.setJob(rs.getString("job"));
            vo.setHiredate(rs.getString("hiredate"));
            vo.setCommission(rs.getInt("commission"));
            vo.setManagerName(rs.getString(8));
            vo.setSalary(rs.getInt("salary"));
            vo.setDname(rs.getString("dname"));
            list.add(vo);
        }
        
        pstmt.close();
        conn.close();

        return list;
    }

    public String deleteEmp(Scanner s) throws Exception {
        System.out.println("Enter eno: ");
        Integer eno = null;
        conn = manager.getConnection();
        try {
            eno = s.nextInt();
            s.nextLine();
        } 
        catch (Exception e) {
            System.out.println("\ninvalid input");
            s.nextLine();
            return "f";
        }

        try {
            String query = "select e.eno,e.ename,e.job,e.hiredate,e.salary,e.commission,d.dname,ee.ename from employee e full outer join employee ee on (e.manager = ee.eno) full outer join department d on e.dno=d.dno where e.eno = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, eno);
            rs = pstmt.executeQuery();
            rs.next();
            System.out.println("Ename: " + rs.getString(2));
            System.out.println("Job: " + rs.getString("job"));
            System.out.println("ManagerName: " + rs.getString(8));
            System.out.println("Hiredate: " + rs.getString("hiredate"));
            System.out.println("Salary: " + rs.getString("salary"));
            System.out.println("Commission: " + rs.getString("commission"));
            System.out.println("Dname: " + rs.getString("dname"));
        } catch (Exception e) {
            System.out.println("\nnot found");

            pstmt.close();
            conn.close();

            return "f";
        }

        System.out.println("\nDelete(y/n)?: ");
        String yn = s.next();s.nextLine();
        if (yn.equalsIgnoreCase("n")) {
            System.out.println("\ncanceled.");

            pstmt.close();
            conn.close();
            
            return "f";
        } else {
            String query1 = "delete from employee where eno = ?";
            pstmt = conn.prepareStatement(query1);
            pstmt.setInt(1, eno);
            pstmt.executeQuery();

            pstmt.close();
            conn.close();
        
            return "s";
        }

    }

    public String updateEmp(Scanner s) throws Exception {
        System.out.println("Enter eno?: ");
        Integer eno = null;
        try {
            eno = s.nextInt();s.nextLine();
        } catch (Exception e) {
            System.out.println("\ninvalid input");
            s.nextLine();
            return "f";
        }
        
        String query = "select * from employee where eno=?";
        conn = manager.getConnection();
        pstmt = conn.prepareStatement(query);
        pstmt.setInt(1,eno);
        rs = pstmt.executeQuery();
        boolean nxt = rs.next();
        if(nxt == false){
            System.out.println("\nnot found");

            pstmt.close();
            conn.close();

            return"f";
        }
        System.out.print("New ename ("+ rs.getString("ename")+") : ");
        String ename = s.next(); s.nextLine();
        System.out.print("New job ("+ rs.getString("job")+") : ");
        String job = s.nextLine();
        System.out.print("New manager ("+ rs.getString("manager")+") : ");
        String emanager = s.nextLine();
        System.out.print("New hiredate ("+ rs.getString("hiredate")+") : ");
        String hiredate = s.nextLine();
        System.out.print("New salary ("+ rs.getString("salary")+") : ");
        String salary = s.nextLine();
        System.out.print("New commission ("+ rs.getString("commission")+") : ");
        String commission = s.nextLine();
        System.out.print("New dno ("+ rs.getString("dno")+") : ");
        String dno = s.nextLine();
        while (!(dno.equals("10") || dno.equals("20") || dno.equals("30") || dno.equals("40") || dno.equals(""))) {
            System.out.println("invalid dno");
            System.out.print("Another Dno? :");
            dno = s.nextLine();
        }

        System.out.println("\nUpdate(y/n)?: ");
        String yn = s.next();s.nextLine();
        if(yn.equalsIgnoreCase("n")){
            System.out.println("\ncanceled.");
            
            pstmt.close();
            conn.close();
            
            return "f";
        }
        else{
            try{
                String query1 = "update employee set ename = ?, job = ?, manager = ?, hiredate = ?, salary = ?, commission = ?, dno = ? where eno = ?";
                pstmt= conn.prepareStatement(query1);
                pstmt.setString(1, ename);
                pstmt.setString(2, job);
                pstmt.setString(4, hiredate);
                pstmt.setInt(8, eno);
                if(emanager.equals("")){
                    pstmt.setNull(3, Types.NULL);
                }
                else{
                    pstmt.setInt(3, Integer.parseInt(emanager));
                }
                if(salary.equals("")){
                    pstmt.setNull(5, Types.NULL);
                }
                else{
                    pstmt.setInt(5, Integer.parseInt(salary));
                }
                if(commission.equals("")){
                    pstmt.setNull(6, Types.NULL);
                }
                else{
                    pstmt.setInt(6, Integer.parseInt(commission));
                }
                if(dno.equals("")){
                    pstmt.setNull(7, Types.NULL);
                }
                else{
                    pstmt.setInt(7, Integer.parseInt(dno));
                }
                pstmt.execute();

                pstmt.close();
                conn.close();
    
                return"s";
            }
            catch(Exception e){
                e.printStackTrace();
                System.out.println("\ninvalid input");

                pstmt.close();
                conn.close();

                return "f";
            }
        }
    }



}
