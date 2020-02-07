package app.bytestream;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class bytestream2 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\data\\work\\data.txt");
        // FileInputStream fi = new FileInputStream(FileDescriptor.in);
        // System.out.println("in: ");
        // int b = fi.read();

        FileInputStream fi = new FileInputStream(file);
        byte[] b = new byte[100];
        int count = fi.read(b);
        for(int i =0; i<count;i++){
            System.out.println(i+" : "+ (char) b[i]);
        }
    }
}