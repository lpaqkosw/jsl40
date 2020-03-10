package books.vo;

public class BooksVO {
	private int lentno;
	private String custname;
	private int bookno;
	private String phone;
	private String outdate;
	private String indate;
	private String status;

	public int getLentno() {
		return lentno;
	}

	public void setLentno(int lentno) {
		this.lentno = lentno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getBookno() {
		return bookno;
	}

	public void setBookno(int bookno) {
		this.bookno = bookno;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOutdate() {
		return outdate;
	}

	public void setOutdate(String outdate) {
		this.outdate = outdate;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		String str;
//		if((this.indate == null || this.indate.isEmpty())&& !(this.outdate == null || this.outdate.isEmpty())) {
//			this.indate = "";
//			this.status = "대출중";
//		}
//		else if((this.indate == null || this.indate.isEmpty())&& (this.outdate == null || this.outdate.isEmpty())) {
//			this.indate = "";
//			this.status = "";
//		}
//		else {
//			this.status = "반납완료";
//		}
		if(this.status == null) {
			str = "";
		}
		else if(this.status.equals("1")) {
			str = "대출중";
		}
		else if(this.status.equals("2")){
			str = "반납완료";
		}
		else {
			str = "";
		}
		
		return lentno+"\t"+custname+"\t"+phone+"\t"+bookno+"\t"+outdate+"\t"+indate+"\t"+str;
		
//		return lentno+"\t"+custname+"\t"+phone+"\t"+bookno+"\t"+outdate+"\t"+indate+"\t\t"+status;
	}
}
	
	

