package app;

import java.util.Scanner;

public class f {
    public static void main(String[] args) throws Exception {
        int[][] arr= new int[6][6];
        int n = 0;
        
        //입
        for (int i = 0; i < arr.length-1; i++){
            for(int j =0; j< arr[i].length-1; j++){
                n++;
                arr[i][j]= n;
                arr[i][5] += arr[i][j]; 
                arr[5][j] += arr[i][j];
                arr[5][5] += arr[i][j];
            }
            System.out.println();
        }


        //출
        System.out.println("\nresults: ");
        System.out.println("comp\tkor\teng\tmath\tpe\ttotal");
        for (int i = 0; i < arr.length; i++){
            if (i == 5){
                System.out.println();
            }
            for(int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}