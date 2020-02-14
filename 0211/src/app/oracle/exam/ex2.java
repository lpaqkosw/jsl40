package app.oracle.exam;

import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dno = s.nextInt();
        s.close();
        OracleSQL oracle = new OracleSQL();
        try{
            oracle.makeConn();
            oracle.deptPrintByDno(dno);
            oracle.takeDown();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}