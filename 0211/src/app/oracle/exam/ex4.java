package app.oracle.exam;

import java.util.Scanner;

public class ex4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String date = s.next();
        s.close();
        OracleSQL oracle = new OracleSQL();
        try{
            oracle.makeConn();
            oracle.empPrintByHireDate(date);
            oracle.takeDown();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}