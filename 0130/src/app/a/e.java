package app.a;

import java.util.Properties;
//System class
//env var path
public class e{
    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.list(System.out);
        System.out.println();
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        

        System.out.println(osName);
        System.out.println(userName);
        System.out.println(userHome);

    }
}