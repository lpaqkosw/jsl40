package app.generics;

class Box{
    private Object obj;
    public void set(Object o){
        obj = o;
    }
    public Object get(){
        return obj;
    }
}

class Apple{

}

public class generics2{
    public static void main(String[] args) {
        Box box = new Box();
        box.set("aaaa");
        String name = (String)box.get();

        box.set(new Apple());
        Apple ap = (Apple) box.get();
    }
}