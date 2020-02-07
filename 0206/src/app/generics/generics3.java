package app.generics;

class Box2<T>{
    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}
public class generics3{
    public static void main(String[] args) {
           Box2<String> box = new Box2<String>();
           box.set("aaaa");
           String name = box.get();

           Box2<Integer> box2 = new Box2<Integer>();
           box2.set(1000);
           int a = box2.get();
    }
}