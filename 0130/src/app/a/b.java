package app.a;
//regex
import java.util.Scanner;
import java.util.regex.Pattern;

public class b{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String pat = "(010|011)-\\d{3,4}-\\d{4}";
        boolean bool = Pattern.matches(pat, str);
        if(bool){
            System.out.println(str);
        }

    }
}