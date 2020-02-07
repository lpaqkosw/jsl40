package app.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashS3{
    public static void main(String[] args) {
        Set set = new HashSet<>();
        set.add("java");
        set.add("python");
        set.add("c++");
        set.add("jsp");
        set.add("servlet");
        set.add("content");
        set.add("tomcat");
        set.add("java");

        System.out.println(set);
        List list = new ArrayList<>(set);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}