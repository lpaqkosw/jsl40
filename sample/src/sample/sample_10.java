package sample;

import java.util.Scanner;

public class sample_10 {
    public static void main(String[] args) throws Exception {
        int oddSum =0;
        int evenSum =0;
        for(int i =0; i <=100; i++){
            if(i%2 ==0){
                evenSum += i;
            }
            else{
                oddSum += i;
            }
        }
        
            System.out.println("oddSum: "+oddSum);
            System.out.println("evenSum: "+evenSum);
    }
}