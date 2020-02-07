package app.b;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt=0;
        Employee[] employees = new Employee[10];
        for(int i = 0;i<employees.length;i++){
            String input = s.next();
            if(input.equals("end")){
                break;
            }
            cnt++;
            String id = input;
            int rank = s.nextInt();
            int time = s.nextInt();

            employees[i] = new Employee(id,rank,time);
        }
        s.close();

        EmployeeData data = new EmployeeData(employees, cnt);
        data.printData();
        
    }
}



/*tc2

aaaa 1 23
bbbb 2 23
cccc 3 23
end

*/

/* tc1

aaaa 1 25
bbbb 3 45
cccc 2 52
dddd 1 60
eeee 2 23
ffff 3 53
gggg 2 42
hhhh 1 14
end

*/


