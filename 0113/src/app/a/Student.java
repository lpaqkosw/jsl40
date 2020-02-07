package app.a;

public class Student {
    public int id;
    public String name;
    public int kor;
    public int math;
    public int eng;
    public int tot;
    public double avg;


    
    public void calcTot(){
        tot = kor+math+eng;

    }

    public void calcAvg(){
        avg = ((int)((((double)tot/3)*100)+0.5))/100.0;
    }

    public void printData(){
        System.out.println("id\tname\tkor\tmath\teng\ttot\tavg");
        System.out.print(id+"\t"+name+"\t"+kor+"\t"+math+"\t"+eng+"\t"+tot+"\t"+avg);
        System.out.println();

    }

    public Student(int id, String name, int kor, int math, int eng) {
        this.id = id;
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "Student [avg=" + avg + ", eng=" + eng + ", id=" + id + ", kor=" + kor + ", math=" + math + ", name="
                + name + ", tot=" + tot + "]";
    }
}