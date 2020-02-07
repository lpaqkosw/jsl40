package app.e;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentExam {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner k = new Scanner(System.in);
        Scanner s = new Scanner(new File("src\\app\\e\\Student.txt"));
        int[] ans = new int[20];
        int cnt=0;
        Student[] students = new Student[20];

        //answer input
        String[] ansStr = k.nextLine().split(",");
        for(int i = 0 ; i<ans.length;i++){
            ans[i] = Integer.parseInt(ansStr[i]); 
        }

        //student input(id,name,stuAns)
        while(s.hasNextLine()){
            int[] ansStu = new int[20];
            String[] input = s.nextLine().split(",");
            int id = Integer.parseInt(input[0]);
            String name = input[1];
            for(int i = 2; i <input.length;i++){
                ansStu[i-2] = Integer.parseInt(input[i]); 
            }
            students[cnt] = new Student(id,name,ansStu);
            cnt++;
        }
        s.close();
        k.close();
        StudentData data = new StudentData(students,cnt,ans);
        data.print();

    }
}

//3,2,1,4,2,3,1,4,2,3,4,1,2,3,2,1,4,2,1,3
//1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1