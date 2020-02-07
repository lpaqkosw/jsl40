package a0103;

import java.util.Scanner;

public class e {

	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int sum =0;
        for(int i = 0; i<10;i++){
            int num = s.nextInt();
            if(num < 0){
                i--;
            }
            else{
                sum +=num;
            }
        }
        // System.out.println(sum);
        // int i =0;
        // while(i<10){
        //     int num = s.nextInt();
        //     if (num > 0){
        //         sum += num;
        //         i++;
        //     }
        // }
        System.out.println(sum);
    }
}

