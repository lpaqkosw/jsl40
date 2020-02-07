package app.e;
//local nested class(inside method)

class Outer2{
    int x = 10;
    int y = 20;
    void disp(){
        class Inner2{
            int a = 100;
            int b = 200;
            void dispIn(){
                System.out.println(a);
                System.out.println(b);
                System.out.println(x);
                System.out.println(y);
            }
        }
        Inner2 in = new Inner2();
        in.dispIn();
    }
}
public class LocalNestedClass{
    public static void main(String[] args) {
        Outer2 ot = new Outer2();
        ot.disp();
    }
}