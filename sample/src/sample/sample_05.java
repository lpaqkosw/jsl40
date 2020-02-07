package sample;

import java.util.Scanner;

public class sample_05 {
    public static void main(String[] args) throws Exception {
        int sum =0;
        
        for(int i =0; i <=10; i++){
           if(i%2 == 0){
               sum-= i;
           }
           else{
               sum += i;
           }
            }
            System.out.println(sum);
        
    }
}