package app;

import java.util.Scanner;

public class m_clone {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[][] arr= new int[11][7];
        //[0]= 번호
        //[1]= 국어
        //[2]= 영어
        //[3]= 수학
        //[4]= 전산
        //[5]= 총점
        //[6]= 개인평균
        String[] name = new String[10]; //이름
        int cnt;

        //입 , 전체 총점 계산
        for(cnt = 0; cnt < arr.length-1; cnt++){
            int sinput = s.nextInt();
            if(sinput == -99){
                break;
            }
            else{
                arr[cnt][0] = sinput;
                String strinput = s.next();
                name[cnt] = strinput;
                for(int j = 1; j < arr[cnt].length-2; j++){
                    arr[cnt][j] = s.nextInt();
                    arr[10][j-1] += arr[cnt][j];
                    arr[10][4] += arr[cnt][j];
                }           
            }
        }
        //입 , 전체 총점 계산 end;


        //개인총점, 개인평균 계산
        for (int i = 0; i <arr.length; i++){
            for(int j = 1; j<5;j++){
                arr[i][5] += arr[i][j];
            }
            arr[i][6] = arr[i][5]/4;
        }
        //개인총점, 개인평균 end;
        
        //출출출출출출출출
        System.out.println("id\tname\tkor\teng\tmath\tcalc\ttot\tavg");
        for (int i = 0; i < cnt; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
                if(j == 0){
                    System.out.print(name[i]+"\t");
                }
            }
            System.out.println();
        }
        //합계 출
        System.out.print("tot:");
        System.out.print("\t\t");
        for (int i = 0; i < 5; i++){
            System.out.print(arr[10][i]+"\t");
        }
        System.out.println();

        
        //과목평균 출
        System.out.print("classavg:");
        System.out.print("\t");
        for (int i = 0; i < 5; i++){
            System.out.print((double)((arr[10][i])/(double)cnt)+"\t");
        }
        System.out.println("\n");
        //평균 넘은 학생 출
        System.out.println("over average: ");
        System.out.println("id\tname\tavg");
        for(int i = 0; i < cnt; i++){
            if((double)arr[i][5] > (double)(arr[10][4]/cnt)){
                System.out.print(arr[i][0]+"\t");
                System.out.print(name[i]+"\t");
                System.out.println(arr[i][6]);

            }
        }

        //출출출출출출출출 end;
        System.out.println();
        s.close();
    }
}



/* test case 1

1 aaaa 10 50 60
2 bbbb 10 20 30
3 cccc 50 60 90
4 dddd 45 65 85
5 eeee 10 50 60
6 ffff 45 75 85
7 gggg 25 21 32
8 hhhh 74 65 38
9 iiii 10 50 46
10 jjjj 45 84 98

*/

/*test case 2

1 bbbb 40 50 60
2 cccc 20 12 60
3 aaaa 40 60 80
4 dddd 80 60 50
-99

*/




