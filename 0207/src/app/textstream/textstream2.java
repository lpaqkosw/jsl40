package app.textstream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class textstream2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("c:\\data\\work\\tstream.txt")));
        String s = br.readLine();
        System.out.println(s);

        br.close();
        
    }
}