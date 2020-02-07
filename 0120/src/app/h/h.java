package app.h;
//abstract class


abstract class AA{
    int x = 100;
    void test(){
        System.out.println(x);
    }
    abstract int sum(int x , int y);
}

class BB extends AA{

    @Override
    int sum(int x, int y) {
        int sum = x+y;
        return sum;
    }
}
public class h{
    public static void main(String[] args) {
        AA a = new BB();
        System.out.println(a.sum(1, 5000));
    }
}