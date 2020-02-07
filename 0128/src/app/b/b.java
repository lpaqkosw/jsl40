package app.b;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class b {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src\\app\\b\\a.txt"));
        while(s.hasNext()) {
        	String str = s.nextLine();
        	System.out.println(str);        	
        }
    }
}