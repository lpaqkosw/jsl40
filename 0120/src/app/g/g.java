package app.g;
//instanceof

class AAAA{

}

class BBBB extends AAAA{

}
public class g{
    static void test(AAAA parent) {
        if(parent instanceof BBBB){
            BBBB bb = (BBBB)parent;
            System.out.println("BBBB cast");
        }
        else{
            System.out.println("BBBB no");

        }
    }
    public static void main(String[] args) {
        AAAA aa = new BBBB();
        test(aa);
        AAAA aaa = new AAAA();
        test(aaa);
    }
}