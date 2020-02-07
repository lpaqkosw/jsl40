package sample;

import java.util.Scanner;

public class sample_13 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt =0;
        
        for(int i =2; i <= n; i++){
            for(int j =2; j <=i; j++){
                if(i%j == 0){
                    if(j == i){
                        cnt++;
                        System.out.println(i+ " is prime");
                    }
                    break;
                }
            }
        }
        System.out.println("number of primes: "+ cnt);
    }
}