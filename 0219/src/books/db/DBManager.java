package books.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    private static DBManager instance = new DBManager();

    public static DBManager getInstance() {
        return instance;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String myDriver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521/XE";
        String user = "system";
        String pw = "1234";

        Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(url, user, pw);

        return conn;

    }
}