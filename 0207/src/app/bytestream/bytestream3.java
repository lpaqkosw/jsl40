package app.bytestream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class bytestream3 {
    public static void main(String[] args) throws Exception {
        File file = new File("c:\\data\\work\\data2.txt");
        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);

        dos.writeInt(50);
        dos.writeDouble(3.14);
        dos.writeBytes("aaaa");
        dos.close();

    }
}