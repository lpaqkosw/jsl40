package app.oracle.exam;

public class ex1{
    public static void main(String[] args) throws Exception{
        OracleSQL oracle = new OracleSQL();
        try{
            oracle.makeConn();
            oracle.deptListPrint();
            oracle.takeDown();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}