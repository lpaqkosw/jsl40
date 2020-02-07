package app.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetLotto {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        for(;set.size()<6;){
            int lotto = new Random().nextInt(45)+1;
            set.add(new Integer(lotto));
        }
        System.out.println(set);

        List list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}