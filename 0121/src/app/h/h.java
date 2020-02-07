package app.h;
//equals override
class AA{
    int a;
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof AA){
            return this.a == ((AA)obj).a;
        }
        else return false;
    }
}

public class h{
    public static void main(String[] args) {
        AA a1 = new AA();
        AA a2 = new AA();
        if(a1.equals(a2)){
            System.out.println("a1 == a2");
        }
        else{
            System.out.println("a1!=a2");
        }
    }
}