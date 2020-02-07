package app.f;

public class Student{
    int id;
    String name;
    int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    void print(){
        System.out.println(id + "\t" + name + "\t"+ score);
    }

    void print(int sw){
        System.out.println(id + "\t" + name + "\t"+ score);
    }
    


}