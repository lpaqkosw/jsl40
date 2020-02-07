package app.a;

import java.util.Stack;

public class Stac {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("aaaa");
        s.push("aaba");
        s.push("aaac");
        s.push("asaa");
        s.push("afaa");

        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }
}