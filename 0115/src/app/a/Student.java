package app.a;

public class Student{
    public int id;
    public String name;
    public int total;
    public double avg;

    public void print(){
        System.out.println("\nid: "+ this.id);
        System.out.println("name: "+ this.name);
        System.out.println("total: "+ this.total);
        System.out.printf("avg: %.2f ", this.avg);
    }

    public Student(int id, String name, int a, int b,int c) {
        this.id = id;
        this.name = name;
        this.total = a+b+c;
        // this.avg = (double)((int)(((double)this.total/3)*100+0.5))/100;
        this.avg = (double)this.total/3;
    }

    
}