package app.a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashS2{
    public static void main(String[] args) {
        Set set = new HashSet<>();
        set.add(new Integer(4));
        set.add(new Integer(3));
        set.add(new Integer(2));
        set.add(new Integer(1));
        set.add(new Integer(5));
        set.add(new Integer(1));
        set.add(new Integer(6));
        set.add(new Integer(12));
        set.add(new Integer(25));
        System.out.println(set);

        Iterator i = set.iterator();
        for(;i.hasNext();){
            System.out.println(i.next());
        }
    }
}