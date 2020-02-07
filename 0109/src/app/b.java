package app;

import java.util.Scanner;

public class b {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[][] arr= new int[5][4];
        int n = 0;
        //출
        //System.out.println("id\tkor\teng\tmath");
        for (int i = 0; i < arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                arr[i][j]=s.nextInt();
                s.nextLine();
            }
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