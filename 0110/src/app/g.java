package app;

import java.util.Scanner;

public class g {
    public static void main(String[] args) throws Exception {
        int[] a = {10,20};
        for(int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }
        swap(a);
        for(int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    static void swap(int[] a){
        int c = a[0];
        a[0] = a[1];
        a[1] = c;
    }


}