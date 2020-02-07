package app.d;
/*
중첩 클래스
inner class
outer class
*/

class Outer{
    private int x = 10;
    int y = 20;
    void out(){
        System.out.println(x);
        System.out.println(y);
    }
    class Inner{
        int a = 100;
        void in(){
            System.out.println(x);
            System.out.println(y);
            System.out.println(a);
        }
    }
}

public class InnerClass{
    public static void main(String[] args) {
        Outer ot = new Outer();
        Outer.Inner oi = ot.new Inner();
       // Outer.Inner oi2 = new Outer().new Inner();
        ot.out();
        oi.in();        
    }
}