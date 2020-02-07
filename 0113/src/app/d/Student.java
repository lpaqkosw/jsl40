package app.d;

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
        System.out.print(id+"\t"+name+"\t"+kor+"\t"+math+"\t"+eng+"\t"+tot+"\t"+avg);
        System.out.println();
    }

    public Student(int[] data,String name) {
        this.id = data[0];
        this.name = name;
        this.kor = data[1];
        this.math = data[2];
        this.eng = data[3];
    }

    @Override
    public String toString() {
        return "Student [avg=" + avg + ", eng=" + eng + ", id=" + id + ", kor=" + kor + ", math=" + math + ", name="
                + name + ", tot=" + tot + "]";
    }
}