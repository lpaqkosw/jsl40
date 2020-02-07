package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_31 {
    public static void main(String[] args) throws Exception {
        //입
        int[][] arr = new int[5][5];
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < i+1; j++){
                num++;   
                arr[i][j] = num;
            }
        }
        
        //출
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length; j++){
                if(arr[i][j]!=0){
                    System.out.print(arr[i][j]+"\t");                   
                }
            }               
            System.out.println("");
        }
    
    }
}