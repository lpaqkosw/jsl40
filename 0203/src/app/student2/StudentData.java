package app.student2;

import java.util.Collections;
import java.util.List;

public class StudentData {
    List<Student> list;

    public StudentData(List<Student> list) {
        this.list = list;
        getRank();
    }

    public void getRank() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).tot < list.get(i).tot) {
                    list.get(j).rank++;
                }
            }
        }
    }

    public void sort() {
        Collections.sort(list);
    }

    public void print() {
        System.out.println("id\tname\tscores\t\t\t\t\ttot\tavg\trank");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }

}