package app.b;

import java.util.Scanner;

public class b{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt=0;
        Employee[] employees = new Employee[10];

        for(int i = 0; i < employees.length;i++){
            int input = s.nextInt();
            if(input == -99){
                break;
            }
            else{
                cnt++;
                int id = input;
                String name = s.next();
                int wage = s.nextInt();

                employees[i] = new Employee(id,name,wage);
            }
        }

        EmployeeData total = new EmployeeData(employees, cnt);
        total.print();
    }
}



/*tc1

1 aaaa 456789
2 bbbb 741852
3 cccc 986532
4 dddd 755953
5 eeee 415263 
-99

*/

/*

1 aaaa 456789
2 bbbb 741852
3 cccc 986532
4 dddd 755953
5 eeee 415263 
1 aaaa 456789
2 bbbb 741852
3 cccc 986532
4 dddd 755953
5 eeee 415263 

*/