package app.c;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dec = s.nextInt();
        int unit = s.nextInt();

        Transform a = new Transform(dec,unit);

        System.out.println("10Áø: " + dec);
        System.out.println(unit+"Áø: "+ a.conversion());
    }
}