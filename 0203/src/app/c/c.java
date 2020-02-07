package app.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c{
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        str.add("aaaa");
        str.add("dddd");
        str.add("bbbb");
        str.add("eeee");
        str.add("cccc");

        for (String string : str) {
            System.out.println(string);
        }

        Collections.sort(str);
        System.out.println();

        for (String string : str) {
            System.out.println(string);
        }
    }
}