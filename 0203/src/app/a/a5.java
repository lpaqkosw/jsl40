package app.a;
//iterator class
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("!!!!");
        list.add("dddd");

        List<String> list2 = list;
        list2.add("ffff");

        for (String string : list) {
            System.out.println(string);
        }

        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}