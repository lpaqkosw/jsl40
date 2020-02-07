package app.a;

import java.text.SimpleDateFormat;
import java.util.Date;

//Date class
//Calendar interface
//GregorianCalendar class
public class Day {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        System.out.println(sdf.format(date));
        
    }
}