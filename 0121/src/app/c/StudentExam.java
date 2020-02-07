package app.c;

public class StudentExam{
    public static void main(String[] args) {
        Student data = new StudentData(1,"aaaa",85);
        data.print();
        data = new StudentData(1,"aaaa",new int[]{90,80,70,50,60,20,10,50,45,65,12,11,0,45,56,89});
        data.print();
    }
}