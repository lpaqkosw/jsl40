package app;

import java.util.Scanner;

public class d {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[][] arr= new int[5][6];
        //출
        //System.out.println("id\tkor\teng\tmath");
        for (int i = 0; i < arr.length; i++){
            System.out.print("student " +(i+1)+": ");
            int sum = 0;
            int n = 0;
            for(int j =0; j< arr[i].length-2; j++){
                arr[i][j]=s.nextInt();
                if(j != 0){
                    sum += arr[i][j];
                    n++;
                }
                
            }
            arr[i][4] = sum;
            arr[i][5] = sum/n;
            System.out.println();
        }

        System.out.println("\nresults: ");
        System.out.println("id\tkor\teng\tmath");
        for (int i = 0; i < arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();
        }


    }
}