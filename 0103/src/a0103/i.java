package a0103;


public class i {

	public static void main(String[] args) {
        // a();
        // System.out.print("\n");
        // b();
        // c();
        // d();
        e();
        
    }
    static void a(){
        int num = 0;
        for(int i =0; i<=5; i++){
            for(int j =0;j<i;j++){
                num++;
                System.out.print(num+ "\t");
            }
            System.out.print("\n");
        }      
    }

    static void b(){
        int a = 64;
        for(int i =0; i<5; i++){
            for(int j =0;j<i;j++){
                a++;
                System.out.print((char)a);
            }
            a = 64;
            System.out.print("\n");
        }      
    }

    static void c(){
        int num = 0;
        for(int i =0; i<=5; i++){
            for(int k = 5-i; k>0;k--){
                System.out.print("\t");
            }
            for(int j =0;j<i;j++){
                num++;
                System.out.print(num+"\t");
            }
            System.out.print("\n");
        }      
    }

    static void d(){
        for(int i =0; i<=5; i++){
            String a ="";
            String b= "";
            for(int k = 0; k<i;k++){
                a += " ";
            }
            for(int j =5-i;j>0;j--){
                a +="*";
            }
            for(int l = 0; l<4-i;l++){
                b += "*";
            }
            for(int m =5-i-1;m>0;m--){
                b +=" ";
            }
            
            System.out.println("\n"+a+b);
        }      
    }

    static void e(){
        
        for(int i =0; i<5; i++){
            String a ="";
            
            for(int k = 0; k<i;k++){
                a += " ";
            }
            for(int j =5-i;j>0;j--){
                a +="*";
            }
            
        System.out.print(a+"\n");
        
        }
       
        for(int i =0; i<=3; i++){
            String b="";
            for(int l = 3-i; l>0;l--){
                b+=" ";
            }
            for(int m =-1;m<i+1;m++){
                b+="*";
            }
        System.out.print(b+"\n");
        }
    }
    
        
    
    
}  



