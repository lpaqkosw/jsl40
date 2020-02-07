package app.h;

import java.util.Scanner;

public class h_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] idScore= new int[10][2];
        Student[] student = new Student[10];
        String[] name = new String[10];
        int input;
        int cnt=0;
        while(true){
                for(int i = 0; i< idScore.length; i++){
                    input = s.nextInt();
                    if(input != -99){
                        idScore[i][0] = input;
                        idScore[i][1] = s.nextInt();
                        name[i] = s.next();
                        student[i]  = new Student(idScore[i], name[i]);
                        cnt++;
                    }
                    else break;
                }
                break;
            }
        for(int i = 0; i < cnt; i++){
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