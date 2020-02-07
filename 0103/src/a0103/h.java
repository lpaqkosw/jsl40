package a0103;


public class h {

	public static void main(String[] args) {
        a();
        // System.out.print("\n");
        // b();
    }
    static void a(){
        for(int i =0; i<=5; i++){
            for(int k = 5-i; k>0;k--){
                System.out.print(" ");
            }
            for(int j =0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }      
    }       
    static void b(){
        for(int i =0; i<5; i++){
            for(int j =0;j<5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }      
    }
}    



