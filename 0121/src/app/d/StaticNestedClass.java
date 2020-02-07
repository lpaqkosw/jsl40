package app.d;
// static nested class
class Outer1{
    int x =100;
    static int y = 200;
    void disp(){
        System.out.println(x);
        System.out.println(y);
    }
    static class Inner1{
        int a =100;
        static int b= 223;
        void dispIn(){
            System.out.println(y);
            System.out.println(a);
        }
    }
}
public class StaticNestedClass{
    public static void main(String[] args) {
        // Outer1 ot = new Outer1();
        Outer1.Inner1 oi = new Outer1.Inner1();
        // ot.disp();
        oi.dispIn();
        System.out.println(Outer1.Inner1.b);
    }
}