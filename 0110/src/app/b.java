package app;

public class b {
    public static void main(String[] args) throws Exception {
        System.out.println(ab(1));

    }

    static int ab(int a){
        int sum = 0;
        for( int i = a; i <=10; i++){
            sum += i;
        }
        return sum;
    }
}