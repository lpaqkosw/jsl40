package app.oracle.exam;

import java.util.Scanner;

public class ex5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        s.close();
        OracleSQL oracle = new OracleSQL();
        try{
            oracle.makeConn();
            oracle.nameSearch(name);
            oracle.takeDown();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}