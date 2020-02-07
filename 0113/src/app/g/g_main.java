package app.g;

import java.util.Scanner;

public class g_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] idScore= new int[10][2];
        Student[] student = new Student[10];
        String[] name = new String[10];

        for(int i = 0; i< idScore.length; i++){
            idScore[i][0] = s.nextInt();
            idScore[i][1] = s.nextInt();
            name[i] = s.next();
            student[i]  = new Student(idScore[i], name[i]);
        }
        

        for(int i = 0; i <idScore.length;i++){
        System.out.println(student[i].toString());
            

        }
        


    }
}



/*

1 2 aaa
2 3 bbb
3 4 ccc
4 5 ddd
5 6 eee
6 7 fff
7 8 ggg
8 9 hhh
9 10 iii
10 11 jjj

*/