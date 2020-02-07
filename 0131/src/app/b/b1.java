package app.b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class b1{
    public static void main(String[] args) {
        String data = "20200131";
        String year = data.substring(0,4);
        String month = data.substring(4, 6);
        String day = data.substring(6);
        String dateStr = year+"-"+month+"-"+day;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // sdf.f
        // System.out.println(dateStr);
        
    }
}