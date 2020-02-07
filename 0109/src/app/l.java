package app;

import java.util.Scanner;

public class l {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[][] arr= new int[10][6];
        String[] name = new String[10];
        double[] avg = new double[10];
        
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
                }            
            }
        }
        //입 end;

        //total, avg 계산
        System.out.println("id\tname\tkor\teng\tmath\ttotal\tavg\trank");
        for (int i = 0; i <arr.length; i++){
            for(int j = 1; j<4;j++){
                arr[i][4] += arr[i][j];
            }
            avg[i] = (double)arr[i][4]/3;
        }
        //total, avg 계산 end;

        //rank 계산
        for (int i = 0; i <arr.length; i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[i][4] > arr[j][4]){
                    arr[j][5]++;
                }
            }
            arr[i][5]++;
        }
        //rank 계산 end;

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




