package app.e;

class AA{
    int a;
    int b;
}

public class e{
    public static void main(String[] args) {
        AA a = new AA();
        AA b =a;
        b.a = 10;
        b.b = 20;

        System.out.println(a);
        System.out.println(b);
        AA[] s = new AA[5];
        s[0] = new AA();
        s[1] = s[0];

        System.out.println(s);
        System.out.println(s[0]);
        System.out.println(s[1]);
    }
}