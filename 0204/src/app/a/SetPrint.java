package app.a;
//access elements in set
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPrint {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("eadd");
        set.add("1234");
        set.add("534");
        set.add("aaaa");

        //1
        for (String string : set) {
            System.out.println(string);
        }
        
        //2
        Iterator<String> i = set.iterator();
        for(;i.hasNext();){
            String s = i.next();
            if(s.equals("1234")){
                i.remove();
            }
        }

        for (String string : set) {
            System.out.println(string);
        }
    }
}