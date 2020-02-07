package app.f;
//override method

class Parent{
    void method1(){
        System.out.println("parend method 1");
    }

    void method2(){
        System.out.println("parend method2");
    }
}

class Child2 extends Parent{
    
    @Override
    void method2(){
        System.out.println("child method2");
    }

    void method3(){
        System.out.println("child method3");
    }

}
public class f{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.method1();
        p.method2();
        Child2 c = new Child2();
        c.method1();
        c.method2();
        c.method3();
        System.out.println("================================================");

        Parent pp = new Child2();
        pp.method1();
        
        
    }
}