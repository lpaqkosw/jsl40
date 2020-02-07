package app.bytestream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class bytestream4 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\data\\work\\data2.txt");
        FileInputStream fos = new FileInputStream(file);
        BufferedInputStream bos = new BufferedInputStream(fos);
        DataInputStream dos = new DataInputStream(bos);
        
        int a = dos.readInt();
        double b = dos.readDouble();
        byte[] bt = new byte[10];
        dos.read(bt);

        System.out.println(a);
        System.out.println(b);
        System.out.println(bt.toString());
        dos.close();
    }
}