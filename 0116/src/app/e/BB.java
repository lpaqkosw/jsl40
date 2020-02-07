package app.e;

class Sample{
    private int a = 10;
    void test(){
        int s = a+20;
    }
}

public class BB{
    Sample s = new Sample();
    void test(){
        s.a = 20;
        s.test();

    }
    
}