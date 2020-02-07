package app.c;

public class Student{
    int id;
    String name;
    int score1;
    int score2;
    int score3;
    int tot;
    double avg;
    int rank=1;

    public Student(int id, String name, int score1, int score2, int score3) {
        this.id = id;
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.tot = score1+score2+score3;
        this.avg = (double)(int)(((double)tot/3)*100+0.5)/100;
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+score1+"\t"+score2+"\t"+score3+"\t"+tot+"\t"+avg+"\t"+rank;
    }

    
    
}