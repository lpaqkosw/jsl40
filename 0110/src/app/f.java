package app;

import java.util.Scanner;

public class f {
    public static void main(String[] args) throws Exception {
        int a=10,b=20;
        swap(a,b);
    }

    static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b= temp;
    }

}