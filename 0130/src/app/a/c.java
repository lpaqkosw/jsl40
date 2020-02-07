package app.a;

import java.util.regex.Pattern;

public class c{
    public static void main(String[] args) {
        String pat = "\\w+@\\w+.\\w+(.\\w+)?";
        String pat2 = "\\w+@\\w+.\\w+(\\.\\w+)?";
        String em = "abc@aaa.com";
        String em2= "abc@aaa.co.kr";
        System.out.println(Pattern.matches(pat, em));
        System.out.println(Pattern.matches(pat, em2));
        System.out.println(Pattern.matches(pat2, em2));


    }
}