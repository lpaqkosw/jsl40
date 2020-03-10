package vo;

public class CustVO {
	private Integer custno;
	private String custname;
	private String phone;
	private String gender;
	private String joindate;
	private String grade;
	public Integer getCustno() {
		return custno;
	}
	public void setCustno(Integer custno) {
		this.custno = custno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		String genStr = "";
		String graStr = "";
		if(this.gender != null && this.gender.equals("M")) {
			genStr = "남자";
		}
		else {
			genStr = "여자";
		}
		if(this.grade != null && this.grade.equals("A")) {
			graStr = "VIP";
		}
		else if(this.grade != null && this.grade.equals("B")) {
			graStr = "일반";
		}
		else {
			graStr = "직원";
		}
		// TODO Auto-generated method stub
		return custno+"\t"+custname+"\t"+phone+"\t\t"+genStr+"\t"+joindate+"\t\t"+graStr;
	}
}
