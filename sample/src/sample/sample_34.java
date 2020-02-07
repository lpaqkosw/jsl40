package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_34 {
    public static void main(String[] args) throws Exception {
       //입
       int[][] arr = new int[5][5];
       int num = 0;
       //boolean sw = false;
       for(int i = 0; i < arr.length; i++){
           if(i%2!=0){
               for(int j =0; j < arr[0].length; j++){
                   num++;
                   arr[i][j] = num;
                   //sw = false;
               }
           }
           else{
               for(int j = arr.length -1; j >=0;j--){
                   num++;
                   arr[i][j] = num;
                   //sw = true;
               }
           }
           
       }
       
       //출
       for(int i = 0; i < arr.length; i++){
           for(int j =arr.length-1; j >= 0; j--){
               if(arr[i][j]==0){
                   System.out.print("\t");
               }
               else{
                   System.out.print(arr[i][j]+"\t");                   
               }
           }               
           System.out.println("");
       }
   }

}