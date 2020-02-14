package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dto.EmpVO;
import oracle.db.DBManager;

public class DataDAO{
    DBManager manager = DBManager.getInstance();
    Connection conn = null;
    PreparedStatement pstmt= null;
    ResultSet rs = null;

    public List<EmpVO> s1() throws Exception{
        List<EmpVO> list = new ArrayList<EmpVO>();
        String query = "select ename,salary,salary+300 from employee";
        conn = manager.getConnection();
        pstmt = conn.prepareStatement(query);
        rs = pstmt.executeQuery();
        while(rs.next()){
            EmpVO vo = new EmpVO();
            vo.setEname(rs.getString("ename"));
            vo.setSalary(rs.getInt("salary"));
            list.add(vo);
        }

        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(conn != null) conn.close();
        return list;
    }
    
    public List<EmpVO> s2() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename,salary,salary*12+100 from employee order by salary*12+100 desc";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setSalary(rs.getInt("salary"));
    		vo.setWild(rs.getInt("salary*12+100"));
    		list.add(vo);
    	}
    	return list;
    }
    
    public List<EmpVO> s3() throws Exception{
    	List <EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename,salary from employee where salary >2000 order by salary desc";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setSalary(rs.getInt("salary"));
    		list.add(vo);
    	}
    	return list;
    }
    
    public EmpVO s4() throws Exception{
    	String query = "select ename, dno from employee where eno = 7788";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	rs.next();
    	EmpVO vo = new EmpVO();
    	vo.setEname(rs.getString("ename"));
    	vo.setDno(rs.getInt("dno"));
    	return vo;
    }
    
    public List<EmpVO> s5() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename,salary from employee where salary not between 2000 and 3000";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setSalary(rs.getInt("salary"));
    		list.add(vo);   		
    	}
    	return list;
    }
    
    public List<EmpVO> s6() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename,job,to_char(hiredate,'yyyy-mm-dd') from employee where hiredate between '1981-02-20' and '1981-05-01'";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setJob(rs.getString("job"));
    		vo.setHiredate(rs.getString(3));
    		list.add(vo);
    	}
    	return list;
    }
    
    public List<EmpVO> s7() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename,dno from employee where dno between 20 and 30 order by ename asc";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setDno(rs.getInt("dno"));
    		list.add(vo);
    	}
    	return list;
    }
    
    public List<EmpVO> s8() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename, salary, dno from employee where salary between 2000 and 3000 and dno between 20 and 30 order by ename asc";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setSalary(rs.getInt("salary"));
    		vo.setDno(rs.getInt("dno"));
    		list.add(vo);
    	}
    	
    	return list;
    }
    
    public List<EmpVO> s9() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename,to_char(hiredate,'yyyy-mm-dd') from employee where hiredate like '81%'";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setHiredate(rs.getString(2));
    		list.add(vo);
    	}
    	return list;
    }
    
    public List<EmpVO> s10() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename,job from employee where manager is null";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setJob(rs.getString("job"));
    		list.add(vo);
    	}
    	return list;
    }
    
    public List<EmpVO> s11() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query="select ename,salary,commission from employee where commission is not null order by salary desc, commission desc";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setSalary(rs.getInt("salary"));
    		vo.setCommission(rs.getInt("commission"));
    		list.add(vo);
    	}
    	return list;
    }
    
    public List<EmpVO> s12() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename from employee where ename like '__R%'";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		list.add(vo);
    	}
    	return list;
    }
    
    public List<EmpVO> s13() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename from employee where ename like '%A%' and ename like '%E%'";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		list.add(vo);
    	}
    	return list;
    }
    
    public List<EmpVO> s14() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename,job,salary from employee where job in('CLERK','SALESMAN') and salary not in(1600,950,1300)";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setJob(rs.getString("job"));
    		vo.setSalary(rs.getInt("salary"));
    		list.add(vo);
    		
    	}
    	return list;
    }
    
    public List<EmpVO> s15() throws Exception{
    	List<EmpVO> list = new ArrayList<EmpVO>();
    	String query = "select ename, salary, commission from employee where commission >=500";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	rs = pstmt.executeQuery();
    	while(rs.next()) {
    		EmpVO vo = new EmpVO();
    		vo.setEname(rs.getString("ename"));
    		vo.setSalary(rs.getInt("salary"));
    		vo.setCommission(rs.getInt("commission"));
    		list.add(vo);
    		
    	}
    	return list;
    }
}