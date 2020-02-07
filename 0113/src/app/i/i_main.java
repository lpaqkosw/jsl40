package app.i;


import java.util.Scanner;

public class i_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee[] employee = new Employee[5];
        int cnt = 0;
        
            for(int i =0; i<employee.length; i++){
                int input = s.nextInt();
                if(input ==-99){
                    break;
                }
                int id = input;
                String name = s.next();
                int wage = s.nextInt();
                cnt++;
                employee[i] = new Employee(id, name, wage);
            }
            s.close();


        System.out.println("\nid:\tname:\twage:\t50000:\t10000:\t5000:\t1000:\t500:\t100:\t50:\t10:\t5:\t1:");
        for(int i = 0; i<cnt; i++){
            employee[i].printData();
        }
    }
}



/*
1 asdf 123000
2 vwea 235464
3 fasdf 489321
4 fdsae 1238947
5 asdf 3574946
*/