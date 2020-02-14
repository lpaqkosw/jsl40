package customer.model;

public class CustomerVO {
	private int num;
	private String name;
	private String tel;
	private String addr;
	private String office;
	private String birthday;
	private String sex;
	private String indate;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getIndate() {
		return indate;
	}
	
	public void setIndate(String indate) {
		this.indate = indate;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(num+"\t"+name+"\t"+tel+"\t"+addr+"\t");
		if(addr.length() <= 7) {
			sb.append("\t");
		}
		sb.append(office+"\t");
		
		sb.append(birthday+"\t"+sex+"\t"+indate);
		
		return sb.toString();
	}
}
