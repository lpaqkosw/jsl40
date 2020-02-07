package app.a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
//TreeSet
import java.util.TreeSet;

public class a {
    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();
        for (int i = 0; set.size()<6; i++) {
            int n = (int)(Math.random()*45)+1;
            set.add(n);
        }
        System.out.println(set);

        Set set2 = new HashSet<>();
        for (int i = 0; set2.size()<6; i++) {
            int n = (int)(Math.random()*45)+1;
            set2.add(n);
        }
        
        System.out.println(set2);
    }
}