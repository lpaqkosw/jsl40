package app.f;
//Anonymous nested class

class Inner3{
    void aaa(){
        System.out.println("aaaaaaaaaaaaaa");
    }
    void bbb(){
        System.out.println("bbbbbbbbbbbbb");
    }
    
}
public class AnonymousNestedClass{
    public static void main(String[] args) {
        Inner3 i = new Inner3(){
            @Override
            void aaa() {
                System.out.println("override");
            }
        };
        i.bbb();
        i.aaa();
        
    }
}