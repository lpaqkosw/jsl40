package app.d;
import java.util.StringTokenizer;
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
        StringTokenizer st = new StringTokenizer(input,"., ");
        this.id = Integer.parseInt(st.nextToken());
        this.name = st.nextToken();
        this.kor = Integer.parseInt(st.nextToken());
        this.eng = Integer.parseInt(st.nextToken());
        this.math = Integer.parseInt(st.nextToken());
        this.tot = kor+eng+math;
        this.avg = Math.round(((kor+eng+math)/3.)*100)/100.;
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg;
    }

    

    
}