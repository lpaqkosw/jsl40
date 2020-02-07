package app.c;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hmap2{
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put("java", 100);
        map.put("aaaa", 10);
        map.put("bbbb", 65);
        map.put("cccc", 55);
        map.put("dddd", 44);

        Set set = map.keySet();
        System.out.println(set);
        Collection c = map.values();
        System.out.println(c);
        Iterator i = c.iterator();
        int sum =0;
        
        System.out.println(sum);
        
    }
}