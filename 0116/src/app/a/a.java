package app.a;

import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] students = new Student[10];
        int cnt=0;

        //입력  학생생성
        for(int i = 0; i<students.length;i++){
            int input = s.nextInt();
            if(input ==-99){
                break;
            }
            else{
                cnt++;
                int id = input;
                String name = s.next();
                int kor = s.nextInt();
                int eng= s.nextInt();
                int math = s.nextInt();

                students[i] = new Student(id, name, kor, eng, math);
            }
        }

        //학생정보 조작 계산 정렬 출력
        StudendData data = new StudendData(students, cnt);
        data.print();
    }
}

/*tc1
1 aaaa 22 33 44
2 bbbb 45 56 78
3 cccc 78 88 98
4 dddd 11 45 52
5 eeee 45 65 63
-99
*/

/*tc2
1 aaaa 22 33 44
2 bbbb 45 56 78
3 cccc 78 88 98
4 dddd 11 45 52
5 eeee 45 65 63
6 ffff 74 85 52
7 gggg 98 65 32
8 hhhh 21 54 87 
9 iiii 41 52 63
10 jjjj 75 95 53
*/

/*tc3
6 ffff 74 85 52
7 gggg 98 65 32
2 bbbb 45 56 78
3 cccc 78 88 98
4 dddd 11 45 52
10 jjjj 75 95 53
1 aaaa 22 33 44
5 eeee 45 65 63
-99
*/
