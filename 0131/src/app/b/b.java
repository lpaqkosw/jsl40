package app.b;

import java.text.DecimalFormat;

//DecimalFormat class
public class b{
    public static void main(String[] args) {
        int a = 789456;
        
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.print(df.format(a));
    }
}