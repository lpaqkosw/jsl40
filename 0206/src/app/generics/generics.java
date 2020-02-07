package app.generics;

import java.util.List;
import java.util.ArrayList;

public class generics{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aaaa");
        //list.add(1111);
        String name = list.get(0);
        //int n = (int) list.get(1);
    }
}