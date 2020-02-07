package sample;

import java.util.Scanner;

public class sample_01 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n >0 && n <=99){
            switch(n/10){
                case 9:{
                    System.out.println("수");
                    break;
                }
                case 8:{
                    System.out.println("우");
                    break;
                }
                case 7:{
                    System.out.println("미");
                    break;
                }
                case 6:{
                    System.out.println("양");
                }
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:{
                    System.out.println("가");
                    break;
                }
            }
        }
        else System.out.println("error");

    }
}