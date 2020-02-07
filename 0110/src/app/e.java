package app;

import java.util.Scanner;

public class e {
    public static void main(String[] args) throws Exception {
        String name ="java";
        int score[] = {90,80,70,31};
        ePrint(name, score);

    }

    static void ePrint(String a, int[] b){
        int sum =0;
        double avg;
        System.out.print(a+": ");

        for( int i = 0; i <b.length; i++){
            sum += b[i];
            System.out.print(b[i]+" ");
        }
        System.out.print("\t");
        avg = (double)sum/b.length;
        System.out.println(sum+" "+ avg);
    }

}