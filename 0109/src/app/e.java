package app;

import java.util.Scanner;

public class e {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[][] arr= new int[5][6];
        
        //입
        //System.out.println("id\tkor\teng\tmath");
        for (int i = 0; i < arr.length; i++){
            System.out.print("student " +(i+1)+": ");
            int n = 0;
            for(int j =0; j< arr[i].length-2; j++){
                arr[i][j]=s.nextInt();
                if(j != 0){
                    arr[i][4] += arr[i][j];
                    n++;
                }
               
            }
            arr[i][5] = arr[i][4]/n; 
            System.out.println();
        }

        //출
        System.out.println("\nresults: ");
        System.out.println("id\tkor\teng\tmath\ttotal\tavg");
        for (int i = 0; i < arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();
        }


    }
}