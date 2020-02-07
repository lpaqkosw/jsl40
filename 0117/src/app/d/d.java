package app.d;

import java.util.Scanner;


public class d {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        int cnt =0;

        for(int i =0; i < employees.length; i++){
            String input = s.next();
            if(input.equals("end")){
                break;
            }
            else{
                cnt++;
                employees[i] = new Employee();
                employees[i].setDivision(input);
                employees[i].setId(s.nextInt());
                employees[i].setName(s.next());
                employees[i].setPay(s.nextInt());
            }
        }

        DivisionTotal data = new DivisionTotal(employees, cnt);
        data.printData();
    }
}


/*tc1

인사 1001 aaaa 357000
인사 1302 bbbb 456789
기계 3402 cccc 744125
기계 7894 dddd 654987
기계 4561 eeee 258456
법무 9876 ffff 666666
법무 1111 gggg 741852
end

*/

/* tc2
인사 1111 aaaa 456123
기계 2222 bbbb 987654
기계 2121 cccc 456789
법무 2222 dddd 654987
법무 2121 eeee 963852
법무 4444 ffff 245786
총무 5466 gggg 111111
총무 9999 hhhh 222222
총무 1234 iiii 123123
총무 1010 jjjj 321321


*/

/*tc3

인사 1111 aaaa 456123
기계 2222 bbbb 987654
기계 2121 cccc 456789
기계 2222 dddd 654987
기계 2121 eeee 963852
법무 4444 ffff 245786
end

*/

/*tc4
인사 1111 aaaa 111111
기계 2222 bbbb 222222
법무 3333 cccc 333333
end
*/