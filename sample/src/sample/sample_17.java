package sample;

import java.util.Scanner;

public class sample_17 {
    public static void main(String[] args) throws Exception {
       for(int i = 0; i <5;i++){
           for(int j =1; j<= 6-i;j++){
               System.out.print(" ");
           }
           for(int k =0; k <= i; k++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}