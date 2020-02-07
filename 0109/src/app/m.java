package app;

import java.util.Scanner;

public class m {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[][] arr= new int[10][7];
        //[0]= 번호
        //[1]= 국어
        //[2]= 영어
        //[3]= 수학
        //[4]= 전산
        //[5]= 총점
        //[6]= 개인평균
        String[] name = new String[10]; //이름
        double[] avg = new double[10]; //과목 평균
        int[] tot = new int[5];
        
        //입
        for(int i = 0; i < arr.length; i++){
            int sinput = s.nextInt();
            if(sinput == -99){
                break;
            }
            else{
                arr[i][0] = sinput;
                String strinput = s.next();
                name[i] = strinput;
                for(int j = 1; j < arr[i].length-2; j++){
                    arr[i][j] = s.nextInt();
                    tot[j-1] += arr[i][j];
                    tot[4] += arr[i][j];
                }            
            }
        }
        //입 end;

        //total, avg 계산
        System.out.println("id\tname\tkor\teng\tmath\ttotal\tavg\trank");
        for (int i = 0; i <arr.length; i++){
            for(int j = 1; j<4;j++){
                arr[i][5] += arr[i][j];
            }
            arr[i][6] = arr[i][5]/4;
        }
        //total, avg 계산 end;


        //미정렬 출
        for (int i = 0; i < arr.length; i++){
            if(arr[i][0] != 0){
                for(int j =0; j< arr[i].length; j++){
                    System.out.print(arr[i][j]+"\t");
                    if(j == 0){
                        System.out.print(name[i]+"\t");
                    }
                    if(j == 4){
                        System.out.printf("%.2f\t",avg[i]);
                    }
                }
            }
            else break;
            System.out.println();
        }
        //미정렬 출 end;

        System.out.println();

        //석차 정렬
        for(int i =0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int t;
                double avgt;
                String strt;
                if(arr[i][5] > arr[j][5]){
                    for(int k =0; k < arr[j].length; k++){
                        t = arr[i][k];
                        arr[i][k] = arr[j][k];
                        arr[j][k] = t; 
                    }
                    avgt = avg[i];
                    avg[i] = avg[j];
                    avg[j] = avgt;
                    strt = name[i];
                    name[i] = name[j];
                    name[j] = strt;
                }
            }
        }

        //석차 정렬 출
        for (int i = 0; i < arr.length; i++){
            if(arr[i][0] != 0){
                for(int j =0; j< arr[i].length; j++){
                    System.out.print(arr[i][j]+"\t");
                    if(j == 0){
                        System.out.print(name[i]+"\t");
                    }
                    if(j == 4){
                        System.out.printf("%.2f\t",avg[i]);
                    }
                }
            }
            else break;
            System.out.println();
        }
        //석차 정렬 출 end;

        s.close();
    }
}



/* test case 1

1 aaaa 10 50 60 50
2 bbbb 10 20 30 50
3 cccc 50 60 90 50
4 dddd 45 65 85 50
5 eeee 10 50 60 50
6 ffff 45 75 85 50
7 gggg 25 21 32 50
8 hhhh 74 65 38 50
9 iiii 10 50 46 50
10 jjjj 45 84 98 50

*/

/*test case 2

1 bbbb 40 50 60 50
2 cccc 20 12 60 50
3 aaaa 40 60 80 50
4 dddd 80 60 50 50
-99

*/




