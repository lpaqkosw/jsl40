package app.a;

import java.util.List;
import java.util.Vector;

public class a4 {
    public static void main(String[] args) {
        Vector vc = new Vector<>();
        List list = vc;
        System.out.println(vc.capacity());
        System.out.println(vc.size());
        vc.add("aaaa");
        vc.add(0,"bbb");
        vc.add("aaaa");
        for (Object object : vc) {
            System.out.println(vc);
            
        }
    }
}