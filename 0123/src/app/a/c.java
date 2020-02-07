package app.a;
//wrapper autoboxing, autounboxing

public class c{
    public static void main(String[] args) {
        int n = 10;
        Integer nn = n;
        Integer nnn = new Integer(123);
        int nnnn = nnn;


        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toHexString(n));
        System.out.println(Integer.parseInt("1010", 2));
        
        




                
    }
}