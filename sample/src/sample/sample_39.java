package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_39 {
    public static void main(String[] args) throws Exception {
       int[][] arr = new int [2][10];
       for(int i = 0; i < arr.length-1; i++){
           for(int j = i+1;j<arr.length;j++){
               if(arr[i][5] > arr[j][5]){
                   for(int k = 0; k < arr[j].length; k++){
                       int t = arr[i][k];
                       arr[i][k] = arr[j][k];
                       arr[j][k] = t;
                   }
               }
           }
       }
    }
}
