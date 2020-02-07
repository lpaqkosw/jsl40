package app.lambdaform;

@FunctionalInterface
interface BBB{
    void test(int x);
}

public class lambda3{
    public static void main(String[] args) {
        BBB b = (x) -> {
            System.out.println(x);
        };
        
        b.test(3);
    }
}