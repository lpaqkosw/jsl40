package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_30 {
    public static void main(String[] args) throws Exception {
        int[][] arr = new int[5][5];
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length; j++){
                num++;
                arr[j][i] = num;             
             }         
        }
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+"\t");               
            }            
            System.out.println("");
        }
    
    }
}