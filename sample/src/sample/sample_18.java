package sample;

import java.util.Scanner;

public class sample_18 {
    public static void main(String[] args) throws Exception {
       for(int i = 0; i <5;i++){
           for(int j =1; j<= 4-i;j++){
               System.out.print(" ");
           }
           for(int k =0; k <= i*2; k++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}