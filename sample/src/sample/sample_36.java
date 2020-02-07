package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_36 {
    public static void main(String[] args) throws Exception {
       //입
       int[][] arr = new int[5][5];
       int k = 0;
       int c = 1;
       int i = 0;
       int j = -1;
       int f = 5;
       //boolean sw = false;
       while(true){
           for(int n = 0; n < f; n++){
               k++;
               j+=c;
               arr[i][j] =k;
            }
            f -=1;
            if(f > 0){
                for(int n = 0; n< f; n++){
                    k++;
                    i += c;
                    arr[i][j] = k;
                }
            c = c*(-1);    
            }
            else break;
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
