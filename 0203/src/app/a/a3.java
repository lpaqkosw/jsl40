package app.a;

import java.util.ArrayList;
import java.util.List;

class AA {
    int h;
    String n;

    AA() {
    }

    AA(int h, String n) {
        this.h = h;
        this.n = n;
    }

    @Override
    public String toString() {
        return "AA [h=" + h + ", n=" + n + "]";
    }

    
}

public class a3 {
    public static void main(String[] args) {
        List<AA> list = new ArrayList<AA>();

        list.add(new AA(1,"aaaa"));
        list.add(new AA(2,"bbbb"));
        list.add(new AA(3,"cccc"));
        list.add(new AA(4,"dddd"));
        list.add(new AA(5,"eeee"));

        for (AA aa : list) {
            System.out.println(aa);
        }
    }
}