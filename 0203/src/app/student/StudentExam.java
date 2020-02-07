package app.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Scanner s = new Scanner(System.in);
        Student stu = null;
        for(;;){
            String[] in = s.nextLine().split(",");
            if(Integer.parseInt(in[0])==0){
                break;
            }
            stu = new Student(in);
            if(list.contains(stu)){                                 //define equals()
                System.out.println("duplicate id");
            }
            else{
                list.add(stu);
            }
        }
        s.close();

        StudentData data = new StudentData(list);
        data.print();                                               //override toString()
        data.sort();
        data.print();                                               //override toString()
    }
}

/*
5,eeee,11,22,33,44,55
8,hhhh,23,77,19,56,93
2,bbbb,12,32,43,54,65
1,aaaa,23,34,45,56,67
7,gggg,24,35,46,57,68
3,cccc,65,76,87,98,9
1,fdas,66,33,99,45,50
6,ffff,13,14,15,16,17
4,dddd,44,55,66,77,88
8,asdf,43,54,44,97,12
9,ffdd,50,40,35,62,90
0
*/
