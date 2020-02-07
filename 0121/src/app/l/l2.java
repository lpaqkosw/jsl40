package app.l;
class Test{
    String name;
}
public class l2{
    public static void main(String[] args) {
        Test a = new Test();
        Test b = new Test();
        String[] test = new String[2];
        a.name = "aaaa";
        b.name = "aaaa";
        String x = "aaaa";
        String y = "aaaa";
        test[0] = "bbbb";
        test[1]= "bbbb";

        System.out.println(a.name==b.name);
        System.out.println(x==y);
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(a.name.hashCode());
        System.out.println(b.name.hashCode());
        System.out.println(test[0]==test[1]);
    }

   
}