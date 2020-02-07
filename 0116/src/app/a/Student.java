package app.a;

public class Student{
    public int id;
    public String name;
    public int kor;
    public int eng;
    public int math;
    public int rank =1;
    public double avg;
    public int tot;
    

    public Student(int id, String name, int kor, int eng, int math) {
        this.id = id;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.tot = kor+eng+math;
        this.avg = (double)((int)(((double)this.tot/3)*100+0.5))/100;
    }

    public void printData(){
        System.out.println(id+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+rank);
    }
}