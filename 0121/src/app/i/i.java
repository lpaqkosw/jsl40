package app.i;
//equals override
class Student{
    int id;
    String name;
    int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            return this.id == ((Student)obj).id && this.name.equals(((Student)obj).name);
        }
        else return false;
    }
}
public class i{
    public static void main(String[] args) {
        Student s1 = new Student(1,"aaaa", 90);
        Student s2 = new Student(1,"bbbb", 91);

        System.out.println(s1.equals(s2));
    }
}