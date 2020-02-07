package app.a;

import java.util.LinkedList;
import java.util.Queue;

public class Q{
    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.offer("aaa");
        q.offer("bbb");
        q.offer("ccc");
        q.offer("ddd");
        q.offer("eee");
        System.out.println(q);
        q.poll();
        System.out.println(q);
    }
}