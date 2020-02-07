package app.iostream;

import java.io.File;

public class iostream2{
    public static void main(String[] args) {
        File f = new File("C:\\data\\work\\test.txt");
        if(f.exists()){
            f.deleteOnExit();
            System.out.println("fileName: "+ f.getName());
            System.out.println("filePathName: "+ f.getPath());
            System.out.println("filePath: "+ f.getParent());
            System.out.println("fileSize: "+ f.length());
            System.out.println("fileLastModified: "+ f.lastModified());
        }
        else{
            System.out.println(f.getName()+" does not exist");
        }
    }
}