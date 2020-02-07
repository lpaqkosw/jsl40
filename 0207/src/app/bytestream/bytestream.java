package app.bytestream;
/*
bytestream
1.Console
    FileOutputStream
    BufferedOutputStream
    DataOutputStream
    write();

*/

import java.io.*;

public class bytestream{
    public static void main(String[] args) {
        File f = new File("C:\\data\\work\\data.txt");
        try{
            FileOutputStream fo = new FileOutputStream(FileDescriptor.out);     //to console
            FileOutputStream fo2 = new FileOutputStream(f);                     //to file
            byte[] data = {66,68,70,72,(byte)'!'};
            fo.write(data);
            fo2.write(data);
        }
        catch(Exception e){
            e.printStackTrace();
        }        
    }
}