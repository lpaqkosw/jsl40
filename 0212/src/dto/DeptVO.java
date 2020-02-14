package dto;
//beans
public class DeptVO {
    private int dno;
    private String dname;
    private String loc;

    

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }


	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
    }

    @Override
    public String toString() {
        return dno + "\t"+ dname+ "\t"+loc;
    }
}