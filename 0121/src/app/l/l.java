package app.l;

public class l{
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = new int[a.length];
        for(int i = 0; i<a.length;i++){
            b[i] = a[i];
        }
        int[] c= a.clone();
        c[0] = 99;
        for(int i = 0; i < a.length;i++){
            System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]);

        }
    }
}