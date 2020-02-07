package app.lambdaform;

class AA{
    int test(int a, int b){
        System.out.println("AAA");
        return 1;
    }
}
public class lambda{
    public static void main(String[] args) {
        AA a = new AA();
        //a.test();
        //()->{System.out.println("aaaa");}
    }
}