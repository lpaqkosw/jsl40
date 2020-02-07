package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_37 {
    public static void main(String[] args) throws Exception {
       //입
       int[][] arr = new int[5][5];
       int k = 0;
           for(int i = 0; i < arr.length; i++){
               for(int j = 0; j < arr.length -1; j++){
                   k++;
                   arr[i][j] =k;
                   arr[i][4] += arr[i][j];
               }
            }

       for(int x = 0; x < arr.length; x++){
        for(int y =0;y< arr.length; y++){
            if(arr[x][y]==0){
                System.out.print("\t");
            }
            else{
                System.out.print(arr[x][y]+"\t");                   
            }
        }               
        System.out.println("");
    }
    }
}
