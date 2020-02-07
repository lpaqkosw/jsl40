package app.b;
//Comparable interface

import java.util.Arrays;

class Member implements Comparable<Member>{
    String name;
    Member(){}
    Member(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        return this.name.compareTo(o.name);
    }
}
public class Compare {
    public static void main(String[] args) {
        Member m1 = new Member("aaaa");
        Member m2 = new Member("bbbb");
        Member m3 = new Member("cccc");
        Member[] mems = {m1,m3,m2};
        for(int x = 0; x < mems.length;x++){
            System.out.print(mems[x].name+"\t");
        }
        System.out.println();
        Arrays.sort(mems);
        for(int x = 0; x < mems.length;x++){
            System.out.print(mems[x].name+"\t");
        }
    }
}