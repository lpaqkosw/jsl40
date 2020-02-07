package sample;

import java.util.Scanner;

public class sample_02 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        if(a < b){
            System.out.println("min: "+a);
            System.out.println("max: "+b);
        }
        else{
            System.out.println("min: "+b);
            System.out.println("max: "+a);
        }

    }
}