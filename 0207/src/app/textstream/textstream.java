package app.textstream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/*
Text IO:
Reader/Writer
    InputStreamReader   /   OutputStreamReader      - > Standard io (ex. keyboard input, console output)

    FileReader      /   FileWriter                  - > file io
    BufferedReader  /   BufferedWriter
                    /   PrintWriter

*/
public class textstream {
    public static void main(String[] args) throws IOException {
        //File file = new File("c:\\data\\work\\tstream.txt");

        //Console out
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        pw.println("aaaa");
        pw.close();

        //File out
        PrintWriter pw1 = new PrintWriter(new BufferedWriter(new FileWriter(new File("c:\\data\\work\\tstream.txt"))));
        pw1.write("bbbb");
        pw1.close();

    }
}