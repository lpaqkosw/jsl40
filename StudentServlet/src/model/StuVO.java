package model;

public class StuVO {
		private int bun;
		private String name;
		private String sex;
		private int kor;
		private int eng;
		private int mat;
		private String regdate;
		private int tot;
		private double avg;
		private String grade;
		
		public int getTot() {
			return tot;
		}
		public void setTot(int tot) {
			this.tot = tot;
		}
		public double getAvg() {
			return avg;
		}
		public void setAvg(double avg) {
			this.avg = avg;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public int getBun() {
			return bun;
		}
		public void setBun(int bun) {
			this.bun = bun;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMat() {
			return mat;
		}
		public void setMat(int mat) {
			this.mat = mat;
		}
		public String getRegdate() {
			return regdate;
		}
		public void setRegdate(String regdate) {
			this.regdate = regdate;
		}
}
