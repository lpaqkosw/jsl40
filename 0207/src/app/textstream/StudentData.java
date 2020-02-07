package app.textstream;

import java.util.List;

public class StudentData {
    List<Student> students;

    public StudentData(List<Student> students) {
        this.students = students;
    }

    public String print(){
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < students.size(); j++) {
            sb.append(students.get(j)+"\n");
        }
        return sb.toString();
    }
}