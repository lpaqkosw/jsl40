package app.iostream;
//make directory
import java.io.File;

public class iostream {
    public static void main(String[] args) {
        File f = new File("C:\\data\\work");
        if(f.exists()){
            f.delete();
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}
        System.out.println("시작");
        try {
            Thread.sleep(3000);
        } catch (Exception d) {}
            if(!f.exists()){
                f.mkdir();
            }
        }
    }