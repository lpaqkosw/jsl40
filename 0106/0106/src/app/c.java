package app;

import java.util.Scanner;

public class c {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int unit =50000;
        boolean sw = true;
        for(int i =1; i <=10; i++){
            int n = input/unit;
            System.out.println(unit+":"+n);
            if(sw){
                input = input%unit;
                unit=unit/5;
                sw = false;
            }
            else{
                input = input%unit;
                unit=unit/2;
                sw = true;
            }
        }
    }
}