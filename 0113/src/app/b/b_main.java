package app.b;

import app.a.Student;

public class b_main {
    public static void main(String[] args) {
        Student b =new Student(1, "aaaa", 2, 3, 4);
        Tv a = new Tv();
        a.chUp();
        a.chUp();
        System.out.println(a.toString());
        b.printData();

    }
} 
