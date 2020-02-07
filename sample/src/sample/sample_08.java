package sample;

import java.util.Scanner;

public class sample_08 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int max =0;
        int min = 999;
        int input;
        while(true){
            input = s.nextInt();
            if(input == -99){
                break;
            }
            if(input < min){
                min = input;
            }
            if(input > max){
                max = input;
            }
        }
            System.out.println("max: "+max);
            System.out.println("min: "+min);
    }
}