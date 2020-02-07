package app.g;
//exception try catch finally
import java.io.IOException;

public class Except {
    public static void main(String[] args) throws Exception{
        try{
            int a = System.in.read();
        }
        catch(IOException e){
            System.out.println("error");
        }
        catch(Exception ee){
            ee.printStackTrace();
        }
        finally{

        }
    }

       
    
}