package app.m;

class AA11{
    int x = 10;
    void sum(){
        System.out.println(x);
    }
}

interface A{
    void test();
}

class AA implements A{
    @Override
    public void test() {
        System.out.println("AA");
    }
}

class BB implements A{
    @Override
    public void test() {
        System.out.println("BB");
        
    }
}

class CC implements A{
    @Override
    public void test() {
        System.out.println("CC");
        
    }
}

public class m{
    public static void main(String[] args) {
        A a = new AA();
        a= new BB();
        a = new CC();
        
    }
}