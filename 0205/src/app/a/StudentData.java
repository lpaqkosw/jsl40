package app.a;

import java.util.Collections;
import java.util.List;

public class StudentData {
    List<Student> students;

    public StudentData(List<Student> students) {
        this.students = students;
        
    }

    public void print(){
        for (Student stu : this.students) {
            System.out.println(stu);
        }
        System.out.println();
    }

    public void sortByGrade(){
        for(int i = 0; i < students.size()-1; i++){
            for(int j = i+1; j < students.size(); j++){
                if(students.get(i).score < students.get(j).score){
                    Student tmp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, tmp);
                }
            }
        }
    }

    public void sortById(){
        for(int i = 0; i < students.size()-1; i++){
            for(int j = i+1; j < students.size(); j++){
                if(students.get(i).IdInt > students.get(j).IdInt){
                    Student tmp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, tmp);
                }
            }
        }
    }

    public void sortByName(){
        Collections.sort(this.students);
    }
}
