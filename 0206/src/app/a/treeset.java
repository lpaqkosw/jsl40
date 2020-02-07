package app.a;
import java.util.TreeSet;


public class treeset {
    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();
        int[] scores = {80,95,70,44,56,10,100,59};
        for (int i = 0; i < scores.length; i++) {
            set.add(scores[i]);
        }
        System.out.println(set);
        System.out.println("less than 50: "+ set.tailSet(50));
        System.out.println("more than 50: "+ set.headSet(50));
        System.out.println("lowest : "+ set.first());
        System.out.println("highest: "+ set.last());
        System.out.println("first lower than parameter 50: "+ set.lower(50));
        System.out.println("first higher than parameter 50: "+ set.higher(50));
        System.out.println("the greatest element less than parameter 90: "+ set.floor(90));
        System.out.println("the least element greater than parameter 90: "+ set.ceiling(90));

        System.out.println(set);
        for(;!set.isEmpty();){
            int sc = (int)set.pollFirst();
            System.out.println(sc);
            System.out.print(set);
            System.out.println(set.size());
        }

        
    }
}