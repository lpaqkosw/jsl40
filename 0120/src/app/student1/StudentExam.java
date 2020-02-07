package app.student1;

import java.util.Scanner;

public class StudentExam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] score = new int[10];
        int id = s.nextInt();
        String name = s.next();
        for(int i =0;i<score.length;i++){
            int input = s.nextInt();
            if(input == -99){
                break;
            }
            else{
                score[i] = input;
            }
        }
        s.close();

        Student data = new StudentHak(id, name, score);
        data.account();
        data.maxMin();
        data.scoreSelection();
        data.scoreBubble();
        
    }
}

/*
1 aaaa 8 5 2 4 1 3 9 6 4 0
*/


/*
2 bbbb 78 45 12 32 65 98 52 56 45 11
*/