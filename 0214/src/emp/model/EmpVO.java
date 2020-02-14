package emp.model;

public class EmpVO {
	private int eno;
	private String ename;
	private String job;
	private Integer manager;
	private String managerName;
	private String hiredate;
	private Integer salary;
	private int commission;
	private int dno;
	private String dname;

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

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(eno+"\t"+ename+"\t"+job);
		if(job!=null && job.length() <= 7){
			sb.append("\t");
		}
		sb.append("\t"+manager+"\t"+hiredate+"\t"+salary+"\t"+commission+"\t\t"+dno+"\t"+dname);
		if(dname!=null && dname.length() <= 7){
			sb.append("\t");
		}
		if(managerName!=null){
			sb.append("\t"+managerName);
		}
		return sb.toString();
	}
	
}
