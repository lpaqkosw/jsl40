package app.student1;

public abstract class Student{
    int id;
    String name;
    int[] score = new int[10];
    int tot;
    double avg;

    public Student(int id, String name, int[] score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    
    public void title(){
        System.out.println("id\tname\ttot\tavg");
    }

    public abstract void account();
    public abstract void maxMin();
    public abstract void scoreSelection();
    public abstract void scoreBubble();
    

    
}