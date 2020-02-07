package app.b;

import java.util.Arrays;

public class d{
    public static void main(String[] args) {
        int[] var = {80,90,30,20,56,95};
        String[] name = {"aaaa", "cccc", "hhhh","bbbb"};
        Arrays.sort(var);
        System.out.println(Arrays.binarySearch(var, 90));
        Arrays.sort(name);
        System.out.println(Arrays.binarySearch(name, "bbbb"));

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
        System.out.println(Arrays.binarySearch(mems, m3));
    }
}