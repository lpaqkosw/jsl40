package app.a;

import java.util.ArrayList;
import java.util.List;


public class a2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("123");
        list.add("asdf");
        list.add("dddd");

        for (String el : list) {
            System.out.println(el);
        }
        boolean bool = list.contains("aaaa");
        int index = list.indexOf("aaaa");
        System.out.println(bool);
        System.out.println(index);
    }
}