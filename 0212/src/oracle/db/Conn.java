package oracle.db;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class Conn{
    private String myDriver = "oracle.jdbc.driver.OracleDriver";
    private String myUrl = "jdbc:oracle:thin:@localhost:1521/XE";
    private String myUser = "hr";
    private String myPw = "1234";
    protected Connection myConn;

    public Conn(){}

    public void makeConn() throws Exception {
        Class.forName(this.myDriver);
        myConn = DriverManager.getConnection(myUrl, myUser, myPw);
        System.out.println("load and connect...");
    }

    public abstract void cleanUp() throws Exception;

    public void takeDown() throws Exception{
        cleanUp();
        myConn.close();
    }
}