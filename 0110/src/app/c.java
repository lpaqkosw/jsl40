package app;

import java.util.Scanner;

public class c {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println(ab(s.nextInt()));

    }

    static int ab(int a){
        int sum = 0;
        for( int i = 0; i <=a; i++){
            sum += i;
        }
        return sum;
    }
}