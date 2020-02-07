package app.b;
//Collections.shuffle
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetLotto1{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 1; i <=45;i++ ){
            set.add(new Integer(i));
        }
        System.out.println(set);
        List list = new ArrayList<>(set);
        Collections.shuffle(list, new Random());
        for(int i = 0; i < 6; i++){
            System.out.print(list.get(i)+"\t");
        }
        
    }
}