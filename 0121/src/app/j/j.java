package app.j;
//toString override
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

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
    }
    

    
}
public class j{
    public static void main(String[] args) {
        Student s1 = new Student(1,"aaaa", 90);

        System.out.println(s1);
    }
}