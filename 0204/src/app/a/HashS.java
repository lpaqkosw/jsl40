package app.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashS {
    public static void main(String[] args) {
        Set set = new HashSet<>();
        set.add("dddd");
        set.add("bbbb");
        set.add("dddd");
        set.add("cccc");
        set.add("aaaa");
        set.add("aaaa");

        System.out.println(set);
        List list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("aaaa");
        list.add("dddd");
        list.add("dddd");
        
            System.out.println(list.toString());
            
    }
    
}