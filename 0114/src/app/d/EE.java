package app.d;
public class EE{
    int x;
    int y;
    EE(){
        this(100);
        System.out.println("default");
    }
    EE(int a){
        this.x = a;
        System.out.println("1 param");
    }

    EE(int a, int b){
        this.x = a;
        this.y = b;
        System.out.println("2 param");
    }
}