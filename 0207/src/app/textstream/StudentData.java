package app.textstream;

import java.util.List;

public class StudentData {
    List<Student> students;

    public StudentData(List<Student> students) {
        this.students = students;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < students.size(); i++) {
            sb.append(students.get(i) + "\n");
        }
        return sb.toString();
    }

    public void sortByName(boolean b) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (b) {
                    if (students.get(i).name.compareTo(students.get(j).name) < 0) {
                        Student tmp = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, tmp);
                    } 
                    else {
                        if (students.get(i).name.hashCode() < students.get(j).name.hashCode()) {
                            Student tmp = students.get(i);
                            students.set(i, students.get(j));
                            students.set(j, tmp);
                        }
                    }
                }
            }
        }
    }

    public void sortByTot(boolean b) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if(b){
                    if (students.get(i).tot < students.get(j).tot) {
                        Student tmp = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, tmp);
                    }
                }
                else{
                    if (students.get(i).tot > students.get(j).tot) {
                        Student tmp = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, tmp);
                    }
                }
            }
        }
    }

    public void sortById(boolean b) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if(b){
                    if (students.get(i).id > students.get(j).id) {
                        Student tmp = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, tmp);
                    }
                }
                else{
                    if (students.get(i).id < students.get(j).id) {
                        Student tmp = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, tmp);
                    }
                }
            }
        }
    }

}