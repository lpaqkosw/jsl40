package app.a;

public class Student implements Comparable{
    String id;
    String name;
    int score;
    char grade;
    int IdInt;



    

    @Override
    public String toString() {
        if(this.name.length() >= 10){
            return id+"\t"+name+"\t"+score+"\t"+grade; 
        }
        else{
            return id+"\t"+name+"\t\t"+score+"\t"+grade; 
        }
    }

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
        grade();
        String[] tmp = id.split("-");
        String x;
        if(tmp[2].length()==1){
            x = tmp[0]+tmp[1]+0+tmp[2];
        }else{
            x = tmp[0]+tmp[1]+tmp[2];
        }

        this.IdInt = Integer.parseInt(x);
    }

    public void grade(){
        int tmpScore = this.score/10;
        switch(tmpScore){
            case 10:
            case 9:{
                this.grade = 'A';
                break;
            }
            case 8:{
                this.grade = 'B';
                break;
            }
            case 7:{
                this.grade = 'C';
                break;
            }
            case 6:{
                this.grade = 'D';
                break;
            }
            default:{
                this.grade = 'F'; 
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student tmp = (Student) obj;
            return this.id.equals(tmp.id);
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        Student tmp = (Student) o;
        return this.name.compareTo(tmp.name);
    }
}
    