package app.h;

class DataA {
    int a =10;
}
public class h{
    public static void main(String[] args) {
        DataA a1 = new DataA();
        DataA a2 = new DataA();

        System.out.println((a2));
        System.out.println(a1.a == a2.a);
    }
}