package app.g;

public class Student {
    public int id;
    public String name;
    public int score;


    public Student(int[] a, String name) {
        this.id = a[0];
        this.name = name;
        this.score = a[1];
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
    }

    
}