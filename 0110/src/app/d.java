package app;

import java.util.Scanner;

public class d {
    public static void main(String[] args) throws Exception {
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        aPrint(a);

    }

    static void aPrint(int[] a){
        for( int i = 0; i <a.length; i++){
            System.out.println(a[i]);
        }
        bPrint(a[a.length-1]);
    }

    static void bPrint(int b){
        System.out.println(b);
    }
}