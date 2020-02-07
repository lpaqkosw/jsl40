package app.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class b1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src\\app\\b\\input.txt"));
        System.out.println("id\tname\tkor\teng\tmath\ttot\tavg");
        while(s.hasNext()) {
            String str = s.nextLine();
            Student student = new Student(str);     
            System.out.println(student); 	
        }
    }
}