package app.c;

import java.util.Scanner;

public class StudentExam{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] students = new Student[10];
        int cnt=0;
        int id;
        String name;
        int score1;
        int score2;
        int score3;
        while(true){
            String[] arr = s.nextLine().split(",");
            for(;;){
                if(Integer.parseInt(arr[0])>0&&Integer.parseInt(arr[0])<=10){
                    id = Integer.parseInt(arr[0]);
                }
                else{
                    System.out.println("error: invalid num");
                    break;
                }
                name = arr[1];
                if(arr[1].length()<10){
                    name = arr[1];
                }
                else{
                    System.out.println("error: name too long");
                    break;
                }
                if(Integer.parseInt(arr[2])>0 && Integer.parseInt(arr[2])<=100){
                    score1 = Integer.parseInt(arr[2]);
                }
                else{
                    System.out.println("error: invalid score");
                    break;
                }
                if(Integer.parseInt(arr[3])>0 && Integer.parseInt(arr[3])<=100){
                    score2 = Integer.parseInt(arr[3]);
                }
                else{
                    System.out.println("error: invalid score");
                    break;
                }
                if(Integer.parseInt(arr[4])>0 && Integer.parseInt(arr[4])<=100){
                    score3 = Integer.parseInt(arr[4]);
                }
                else{
                    System.out.println("error: invalid score");
                    break;
                }
                
                students[cnt] = new Student(id,name,score1,score2,score3);
                cnt++;
                break;
            }
            if(cnt >= 10){
                break;
            }
        }
           School data = new School(students,cnt);
           data.print();
            
    }
}
        

/* tc1 - proper 10
2,bbbb,14,15,16
7,gggg,77,66,55
3,cccc,43,42,41
4,dddd,23,45,56
10,jjjj,54,34,54
6,ffff,66,77,88
1,aaaa,12,13,14
8,hhhh,11,22,33
9,iiii,12,99,88
5,eeee,54,34,87
*/

/* tc2 - invalid id added total: 11
1,aaaa,12,13,14
2,bbbb,14,15,16
3,cccc,43,42,41
4,dddd,23,45,56
5,eeee,54,34,87
6,ffff,66,77,88
11,aaaa,12,13,42
7,gggg,77,66,55
8,hhhh,11,22,33
9,iiii,12,99,88
10,jjjj,54,34,54
*/

/*tc2 - invalid name added total: 12
1,aaaa,12,13,14
2,bbbb,14,15,16
3,cccc,43,42,41
4,dddddddddddddd,23,45,56
5,eeee,54,34,87
6,ffff,66,77,88
11,aaaa,12,13,42
7,gggg,77,66,55
8,hhhh,11,22,33
9,iiii,12,99,88
10,jjjj,54,34,54
4,dddd,23,45,56
*/

/*tc2 - invalid score added total: 13
1,aaaa,12,13,14
2,bbbb,14,15,16
3,cccc,43,42,41
3,cccc,43,42,101
4,dddddddddddddd,23,45,56
5,eeee,54,34,87
6,ffff,66,77,88
11,aaaa,12,13,42
7,gggg,77,66,55
8,hhhh,11,22,33
9,iiii,12,99,88
10,jjjj,54,34,54
4,dddd,23,45,56
*/

/*



*/



