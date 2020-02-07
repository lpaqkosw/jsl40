package app.a;

import java.util.ArrayList;
import java.util.List;

public class list{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.add("eeee");

        for (String string : list) {
            System.out.println(string);
        }

        String tmp = list.get(2);
        list.set(2, list.get(4));
        list.set(4, tmp);
        System.out.println();
        for (String string : list) {
            System.out.println(string);
        }
        list.set(0, "asdf");
        System.out.println();
        for (String string : list) {
            System.out.println(string);
        }
        list.add(0, "asdf");
        System.out.println();
        for (String string : list) {
            System.out.println(string);
        }
    }
}