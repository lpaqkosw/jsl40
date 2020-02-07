package app.lambdaform;
//Annotation
//@FunctionalInterface

@FunctionalInterface
interface AAA{
    void method();
}

// class BB implements AAA{
//     @Override
//     public void method() {
//         System.out.println("aaaaa");
//     }
// }
public class lambda2{
    public static void main(String[] args) {
        //BB b = new BB();
        //b.method();
        AAA aa;
        aa=() -> {System.out.println("aaaaa");};
        aa.method();
    }
}