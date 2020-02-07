package app.iostream;
//make file
import java.io.File;

public class iostream1 {
    public static void main(String[] args)  {
        File f = new File("C:\\data\\work");
        if(!f.exists()){
            f.mkdir();
        }

        File f1 = new File(f,"test.txt");
        try{
            if(!f1.exists()){
                f1.createNewFile();
            }
        }
        catch(Exception e){
            System.out.println("Failed");
        }     
    }
}