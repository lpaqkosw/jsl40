package sample;

import java.util.Scanner;

public class sample_19 {
    public static void main(String[] args) throws Exception {
       for(int i = 4; i >= 0;i--){
           for(int j =0; j<= 4-i;j++){
               System.out.print(" ");
           }
           for(int k =0; k <= i*2; k++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}