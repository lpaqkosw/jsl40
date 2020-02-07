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
import java.util.Collections;
import java.util.List;

public class StudentExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("c:\\data\\work\\ex.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedWriter bwf = new BufferedWriter(new FileWriter(new File("c:\\data\\work\\exex.txt")));
        List<Student> students = new ArrayList<Student>();
        
        //create Students
        for(;;){                
            try{
                String[] str = br.readLine().split(",");
                students.add(new Student(str));
            }
            catch(Exception e){
                break;
            }
        }
        StudentData data = new StudentData(students);
        // data.sortById(false);
        // Collections.sort(data.students);
        // data.sortByTot(false);

        //console out
        bw.write("id\tname\tsex\tkor\teng\tmath\ttot\tavg\n"); 
        bw.write(data.print());

        //file out
        bwf.write("id\tname\tsex\tkor\teng\tmath\ttot\tavg");
        bwf.newLine();
        for(int i = 0; i<data.students.size();i++){           
            bwf.write(data.students.get(i).toString());
            bwf.newLine();
        }
        bwf.close();
        br.close();
        
        //written file check
        BufferedReader br2 = new BufferedReader(new FileReader(new File("c:\\data\\work\\exex.txt")));
        for(int j =0; j < data.students.size()+1; j++){
            bw.write(br2.readLine());
            bw.newLine();
        }
        br2.close();
        bw.close();

    }
}