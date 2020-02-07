package app.a;

import java.util.ArrayList;

//collections framework
public class a {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>(10);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.add(3);
        list.add(1);
        list.add(123);
        list.add(Integer.parseInt("323"));
        list2.add("asdf");
        list2.add("123");

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}