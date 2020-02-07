package app.f;

public class f{
    public static void main(String[] args) {
        Student[] stu = new Student[5];
        Student s1 = new Student(0,"GGGG",44);
        stu[0] = s1;
        s1 = new Student();
        stu[1] = s1;
        s1.id = 1;
        s1.name = "aaa";
        s1.score = 20;

        stu[2] = new Student(2,"BBB", 88);
        stu[3] = new Student(3,"CCC", 90);
        stu[4] = new Student(4,"DDD", 77);

        // for(int i = 0; i < stu.length; i++){
        //     stu[i].print();
        // } 

        StudentData data = new StudentData(stu);
        data.print();
        
        

    }
}