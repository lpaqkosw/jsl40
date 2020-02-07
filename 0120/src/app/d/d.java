package app.d;
//inheritance

class Super{
    int x = 100;
    void aa(){
        System.out.println(x);
    }
}

class Child extends Super{
    int y = 200;
}

class ChildA extends Super{
    int y = 200;
}

public class d{
    public static void main(String[] args) {
        Child  s = new Child();
        Super ss = s;

        System.out.println(s.x);
        System.out.println(s.y);
        System.out.println(ss.x);

        

        
    }
}