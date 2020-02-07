package app.d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EmployeeExam {
    public static void main(String[] args) throws FileNotFoundException {
        DecimalFormat df = new DecimalFormat("#,###");
        Scanner s = new Scanner(new File("src\\app\\d\\Employee.txt"));
        int cnt;
        int sum = 0;
        
        for(cnt =0; s.hasNextLine();cnt++){
            s.nextLine();
        }

        Employee[] employees = new Employee[cnt];
        s= new Scanner(new File("src\\app\\d\\Employee.txt"));
        for(int i = 0; i < cnt; i++){
            String[] tmp = s.nextLine().split(",");
            employees[i] = new Employee(tmp);
            sum+=Integer.parseInt(tmp[2]);
        }

        System.out.println("id\tname\twage");

        for(int i = 0; i < cnt; i++){
            System.out.println(employees[i]);
        }

        System.out.println("\ntotal: \t\t"+ df.format(sum));
        System.out.println(cnt);

    }
}