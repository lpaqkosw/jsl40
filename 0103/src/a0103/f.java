package a0103;

import java.util.Scanner;

public class f {

	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String bi ="";
        int num = s.nextInt();
        int quo, rem;
        int t = num;
        do{
            quo = t/2;
            rem = t%2;
            bi = rem+bi;
            t = quo;
        }while(quo != 0);
            System.out.println(bi);
        }
        
    }


