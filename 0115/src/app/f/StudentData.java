package app.f;

public class StudentData {
    public Student[] stu;

    public StudentData(Student[] stu) {
        this.stu = stu;
    }

    public StudentData() {
    }

    void print(){
        for(int i = 0; i < this.stu.length; i++){
            this.stu[i].print();
        }
    }

}