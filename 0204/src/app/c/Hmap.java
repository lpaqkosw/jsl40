package app.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hmap {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "ddd");
        map.put(3, "bbb");
        map.put(1, "ccc");
        System.out.println(map);
        System.out.println(map.get(1));
        Set set = map.keySet();
        System.out.println(set);
        Iterator<Integer> i = set.iterator();
        for(;i.hasNext();){
            int x = i.next();
            System.out.println(x+"\t"+map.get(x));
        }
    }
}