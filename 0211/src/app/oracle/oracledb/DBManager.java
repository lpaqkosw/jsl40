package app.oracle.oracledb;
//singleton

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
    
    private DBManager(){}
    private static DBManager instance = new DBManager();
    public static DBManager getInstance(){
        return instance;
    }

    public Connection getConnection() throws Exception{
        Connection conn = null;
        String myDriver = "oracle.jdbc.driver.OracleDriver";
        String myUrl = "jdbc:oracle:thin:@localhost:1521/XE";
        String myUser = "hr";
        String myPw = "1234";
        try{
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, myUser, myPw);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return conn;

    }
}