package app.textstream;
//file input

//console output

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("c:\\data\\work\\ex.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedWriter bwf = new BufferedWriter(new FileWriter(new File("c:\\data\\work\\exex.txt")));
        List<Student> students = new ArrayList<Student>();
        
        for(;;){                //for(;;) == while(true)
            try{
                String[] str = br.readLine().split(",");
                Student s = new Student(str);
                students.add(s);
            }
            catch(Exception e){
                break;
            }
        }
        
        bw.write("id\tname\tsex\tkor\teng\tmath\ttot\tavg\n");
        bwf.write("id\tname\tsex\tkor\teng\tmath\ttot\tavg");
        bwf.newLine();
        StudentData data = new StudentData(students);
        bw.write(data.print());
        for(int i =0; i < data.students.size(); i++){
            bwf.write(data.students.get(i).toString());
            bwf.newLine();
        }
        bwf.close();
        br.close();
        
        System.out.println();
        System.out.println();
        
        BufferedReader br2 = new BufferedReader(new FileReader(new File("c:\\data\\work\\exex.txt")));
        for(int i =0; i < data.students.size()+1; i++){
            bw.write(br2.readLine());
            bw.newLine();
        }
        br2.close();
        
        bw.close();

    }
}