package app.lambdaform;

@FunctionalInterface
interface DDD{
    int test(int x, int y);
}
public class lambda4{
    public static void main(String[] args) {
        DDD d = (int x, int y) ->{
            return x*y;
        };
        System.out.println(d.test(2, 5));
        
        d= (int x,int y) -> {
            int s =0;
            for(int i = x; i < y; i++){
                s+=i;
            }
            return s;
        };

        System.out.println(d.test(1,10));


    }
}