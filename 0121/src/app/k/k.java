package app.k;
//hashCode override
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


public class k{
    public static void main(String[] args) {
        
    }
}