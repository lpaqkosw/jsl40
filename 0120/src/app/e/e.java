package app.e;
//class casting

class A{

}

class B extends A{

}

public class e{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b1 = (B)a1;

        B b3 = new B();
        A a3 = b3;
        B b4 = (B)a3;
    }

}