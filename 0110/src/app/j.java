package app;

import java.util.Scanner;

public class j {
    public static void main(String[] args) throws Exception {
        int[][] arr = new int[5][7];

        //입
        getInput(arr);

        //개인 총점 계산
        getTotal(arr);

        //미정렬 출
        printArray("id\tscore1\tscore2\tscore3\tscore4\tscore5 ",arr);

        //총점 내림차순 정렬
        sort(arr);

        //정렬 출
        printArray2("id\tscore1\tscore2\tscore3\tscore4\tscore5\ttotal ", arr);
    }

    static void sort(int[][] a){
        for(int i =0; i < a.length-1; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[j][6] > a[i][6]){
                    for(int k = 0; k < a[i].length;k++){
                        int t = a[i][k];
                        a[i][k] = a[j][k];
                        a[j][k] = t;
                    }
                }
            }
        }
        System.out.println();
    }

    static void printArray2(String title, int[][] a){
        System.out.println("sorted Data: ");
        System.out.println(title);
        for(int i =0 ; i < a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j]+"\t");
                }
                System.out.println();
        }
    }

    static void getInput(int[][] a){
        Scanner s = new Scanner(System.in);
        for(int i =0 ; i < a.length; i++){
            for(int j =0; j< a[i].length-1;j++){
                a[i][j] = s.nextInt();
            }
        }
        s.close();
    }

    static void getTotal(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j =1; j<a[i].length-1; j++){
                a[i][6] += a[i][j];
            }
        }
    }

    static void printArray(String title, int[][] a){
        System.out.println("original Data: ");
        System.out.println(title);
        for(int i =0 ; i < a.length; i++){
            for(int j = 0; j<a[i].length-1; j++){
                System.out.print(a[i][j]+"\t");
                }
                System.out.println();
        }
    }

}
    

    
/*test case 1

2 90 80 70 40 30
4 40 50 60 30 25
3 45 56 85 87 96
5 45 24 12 32 23
1 45 78 98 65 32 


*/


