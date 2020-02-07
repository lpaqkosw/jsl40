package app.generics;

class Product<T,M>{
    private T kind;
    private M model;

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}

class Car{

}
public class generics4{
    public static void main(String[] args) {
        Product<String, Integer> product = new Product<String,Integer>();
        product.setKind("Tv");
        product.setModel(1);

        Product<Car,Integer> productCar = new Product<Car,Integer>();
        productCar.setKind(new Car());
        productCar.setModel(1);
    }
}