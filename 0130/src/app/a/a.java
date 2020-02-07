package app.a;
/*regex
\\d - numbers
\\w words or numbers
\\d? none or one number   \\d* more than one numbers
\\d{3} three numbers    \\d{1,3} one to three numbers

*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] var = s.nextLine().split(",");
        for(int i =0;i<var.length;i++){
            boolean bool = Pattern.matches("\\w*", var[i]);
            if(bool){
                System.out.println(var[i]+", ");
            }
        }
        
    }
}