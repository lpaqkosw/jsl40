package app.a;

public class b{
    public static void main(String[] args) {
        String str = "aaaaa";
        String str2 = new String("bbbb");
        StringBuilder s = new StringBuilder("aaaaa");
        s.append("bbb");

        s.append(123);

        System.out.println(s.capacity());
        System.out.println(s.length());
        StringBuffer ss = new StringBuffer();
        ss.append("aaaaaaaaaa");
        System.out.println(ss.capacity());
        System.out.println(ss.length());

    }
}