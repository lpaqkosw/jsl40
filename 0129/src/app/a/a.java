package app.a;

import java.util.Scanner;
import java.util.StringTokenizer;

public class a{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt;
        Student[] students = new Student[10];

        for(cnt = 0; cnt < students.length; cnt++){
            String line = s.nextLine();
            StringTokenizer st = new StringTokenizer(line,", ");
            int id = Integer.parseInt(st.nextToken());
            if(id == -99){
                break;
            }
            else{
                students[cnt] = new Student(id,st);
            }
        }

        StudentData data = new StudentData(students, cnt);
        data.printData();
    }
}


/*
5, eeee, 22 11 33 78 99
1, aaaa, 65 55 77 44 88
4, dddd, 00 55 22 23 41
8, hhhh, 87 54 23 11 45
3, cccc, 63 87 14 19 64
-99
*/

