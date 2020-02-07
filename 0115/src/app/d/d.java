package app.d;

class Data{
    int x;
    int y;
}


public class d{
    public static void main(String[] args) {
        // int a = 10;
        // int b =20;
        // System.out.println(a);
        // System.out.println(b);

        // swap(a, b);
        // System.out.println(a);
        // System.out.println(b);

        // Data d = new Data();
        // d.x = 10;
        // d.y = 20;
        
        // System.out.println(d.x);
        // System.out.println(d.y);

        // swapD(d);

        // System.out.println(d.x);
        // System.out.println(d.y);

        int s[] = {10,20};

        swapA(s);

        System.out.println(s[0]);
        System.out.println(s[1]);

    }

    static void swap(int a, int b){
        int c = a;
        a= b;
        b=c;
    }

    static void swapD(Data d){
        int c = d.x;
        d.x = d.y;
        d.y = c;
    }

    static void swapA(int[] a){
        int c=a[0];
        a[0] = a[1];
        a[1] = c;

    }
}