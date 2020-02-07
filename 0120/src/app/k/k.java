package app.k;
//multi interface


class AAA{
    static int a =100;
    void aaa(){

    }
}

interface BBB{
    static int a = 100;
    void test();
}

interface CCC{
    void ccc();
}

class Test extends AAA implements BBB,CCC{
    @Override
    public void test() {
        System.out.println(AAA.a);
    
    }
    @Override
    public void ccc() {
        // TODO Auto-generated method stub
        
    }

}

public class k{
    public static void main(String[] args) {
        
    }
}