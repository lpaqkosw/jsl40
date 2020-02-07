package sample;

import java.util.Scanner;

public class sample_22 {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int [] arr = new int[10];
       for(int i = 0;i < 10;i++){
            arr[i] = s.nextInt();
       }

       for(int i = 0;i < 10;i++){
        System.out.print(arr[i]+ "\t");
   }
    }
}