package app.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Student> students = new ArrayList<Student>();
        Student stu = null;
        for(;;){
            String[] in = s.nextLine().split(" ");
            if(Integer.parseInt(in[0])==0){
                break;
            }
            try {
                if(Check.isOk(in)==false){
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("invalid input");
                continue;
            }
            stu = new Student(in[0]+"-"+in[1]+"-"+in[2], in[3], Integer.parseInt(in[4]));
            if(students.contains(stu)){
                System.out.println("already exists");
            }
            else{
                students.add(stu);
            }
        }
        StudentData data = new StudentData(students);
        data.sortByGrade();
        data.print();
        data.sortById();
        data.print();
        data.sortByName();
        data.print();
        
    }
}

/* tc - 6 invalid
1 1 1 aaaa 95
3 2 45 bbbb 20
4 2 12 cccc 65
2 8 42 cccd 45
1 4 50 ccca 50
3 5 20 ccccccccccc 60
2 1 13 cccb 101
3 6 41 asdf 71
2 2 32 fdas 81
1 1 22 qwer 61
2 2 44 gfds 100
3 6 45 fdsafdsafd 89
4 2 7 fdsa 54
1 1 45 de 45
1 2 1 54 12
0
*/

/* tc - id already exists
1 1 1 aaaa 100
1 1 1 bbbb 100
2 2 2 cccc 45
0

1-1-1
1101
12

*/