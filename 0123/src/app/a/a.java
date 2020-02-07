package app.a;

import java.text.Format;

public class a{
    public static void main(String[] args) {
        int a = 100;
        String aa= String.valueOf(a);
        int var =100;
        double dou = 3.141582;
        String ss = String.format("%.2f", dou);
        String sss = String.format("%10d %10.3f", var,dou);
        System.out.printf("int = %d  double = %s", var,ss);
        System.out.println(sss);
    }
}