package dto;
//beans
public class EmpVO{
    private int eno;
    private String ename;
    private String job;
    private int manager;
    private String hiredate;
    private int salary;
    private int commission;
    private int dno;
    private int wild;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public int getWild() {
		return wild;
	}

	public void setWild(int wild) {
		this.wild = wild;
	}

	@Override
    public String toString() {
    	if(job.length() > 7) {
    		return eno+"\t"+ename+"\t"+job+"\t"+ manager + "\t" +hiredate+"\t"+salary+"\t"+commission+"\t"+dno;
    	}
    	else {
    		return eno+"\t"+ename+"\t"+job+"\t\t"+ manager + "\t" +hiredate+"\t"+salary+"\t"+commission+"\t"+dno;
    	}
    }

}