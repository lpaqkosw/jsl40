package app;

import java.util.Scanner;

public class h {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(sum(num));
    }

    static int sum(int a){
        Scanner s = new Scanner(System.in);
        int sum=0;
        for(int i =0; i <= a; i++){
            sum += i;

        }
    
        return sum;
    }

}
    

    



