package app.c;

import java.util.Scanner;


public class c {
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

a 1001 aaaa 357000
a 1302 bbbb 456789
b 3402 cccc 744125
b 7894 dddd 654987
b 4561 eeee 258456
c 9876 ffff 666666
c 1111 gggg 741852
end

*/

/* tc2
a 1111 aaaa 456123
b 2222 bbbb 987654
b 2121 cccc 456789
c 2222 dddd 654987
c 2121 eeee 963852
c 4444 ffff 245786
d 5466 gggg 111111
d 9999 hhhh 222222
d 1234 iiii 123123
d 1010 jjjj 321321


*/

/*tc3

a 1111 aaaa 456123
b 2222 bbbb 987654
b 2121 cccc 456789
b 2222 dddd 654987
b 2121 eeee 963852
c 4444 ffff 245786
end

*/

/*tc4
a 1111 aaaa 111111
b 2222 bbbb 222222
c 3333 cccc 333333
end
*/

/*tc5
a 1111 aaaa 111111
a 1111 aaaa 111111
b 2222 bbbb 222222
b 2222 bbbb 222222
c 3333 cccc 333333
c 3333 cccc 333333
end
*/