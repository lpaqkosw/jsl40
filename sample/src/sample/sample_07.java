package sample;

import java.util.Scanner;

public class sample_07 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int sum =0;
        int cnt =0;
        int input;
        do{
            input = s.nextInt();
            sum += input;
            cnt++;
        }while(input != 0);
            System.out.println("sum: "+sum);
            System.out.println("number of input: "+cnt);
    }
}