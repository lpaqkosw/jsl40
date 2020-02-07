package app.b;

import java.math.*;
public class Student{
    int id;
    String name;
    int kor;
    int eng;
    int math;
    int tot;
    double avg;

    public Student(String input) {
        String[] tmp = input.split(",");
        this.id = Integer.parseInt(tmp[0]);
        this.kor = Integer.parseInt(tmp[2]);
        this.eng = Integer.parseInt(tmp[3]);
        this.math = Integer.parseInt(tmp[4]);
        this.name = tmp[1];
        this.tot = kor+eng+math;
        this.avg = Math.round(((kor+eng+math)/3.)*100)/100.;
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg;
    }

    

    
}