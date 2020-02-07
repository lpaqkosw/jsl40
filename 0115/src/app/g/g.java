package app.g;

import java.util.Scanner;

public class g{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        int cnt = 0;
        while(cnt < 10){
            //System.out.print("input: ");
            int input = s.nextInt();
            if(input == -99){
                break;
            }

            int id = input;
            String name = s.next();
            int wage = s.nextInt();

            employees[cnt] = new Employee(id,name,wage);
            cnt++;
        }

        EmployeeData data = new EmployeeData();
        int incDec=s.nextInt(); //1 - 오름, 2 - 내림
        data.dataPrint(employees, cnt);
        data.sortPrint(employees, cnt, incDec);
    }
}


/*
1 aaaa 453000
4 dddd 794613
2 bbbb 423546
6 gggg 456321
9 hhhh 85296374
3 cccc 741852
-99 1

*/

/*
1 aaaa 453000
4 dddd 794613
2 bbbb 423546
3 cccc 741852
6 gggg 456321
9 hhhh 85296374
-99 2

*/

/*
1 aaaa 453000
4 dddd 794613
2 bbbb 423546
3 cccc 741852
7 eeee 795643
11 ffff 548798
6 gggg 456321
9 hhhh 85296374
5 iiii 987654
8 jjjj 45612378
2

*/

/*
1 aaaa 453000
4 dddd 794613
2 bbbb 423546
3 cccc 741852
7 eeee 795643
11 ffff 548798
6 gggg 456321
9 hhhh 85296374
5 iiii 987654
8 jjjj 4561237
1

*/