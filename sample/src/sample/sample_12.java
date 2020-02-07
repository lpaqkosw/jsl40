package sample;

import java.util.Scanner;

public class sample_12 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i =2; i <= n; i++){
            if(n%i == 0){
                if(n == i){
                    System.out.print(n+ " is prime");
                    break;
                }
                System.out.println(n+ " is not a prime");
                break;
            }
        }
   
    }
}