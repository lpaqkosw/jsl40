package app.a;
//System class

public class d{
    public static void main(String[] args) {
        int cnt=0;
        while(true){
            System.out.println(cnt);
            if(cnt == 10){
                //System.exit(1);
                break;
            }
            cnt++;
        }
        System.gc();
        
    }
}