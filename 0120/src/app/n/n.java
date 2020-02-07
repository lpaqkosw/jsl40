package app.n;

interface Car{
    void test();
}

class Truck implements Car{
    @Override
    public void test() {
        System.out.println("Truck Call");
        
    }
}

public class n{
    public static void main(String[] args) {
        Car c = new Truck();
        c.test();

        Car cc = new Car(){
        
            @Override
            public void test() {
                System.out.println("Car call");
            }
        };

        cc.test();
}
}