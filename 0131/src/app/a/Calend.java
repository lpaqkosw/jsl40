package app.a;
//Calendar interface
//interface.getInstance();

import java.util.Calendar;

public class Calend{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DATE);
        int wday = c.get(Calendar.DAY_OF_WEEK);
        int a = c.get(Calendar.AM_PM);
        int b = c.get(Calendar.WEEK_OF_MONTH);
        int i = c.get(Calendar.WEEK_OF_YEAR);
        int d = c.get(Calendar.DAY_OF_MONTH);
        int e = c.get(Calendar.DAY_OF_YEAR);
        int k = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int f = c.get(Calendar.HOUR_OF_DAY);
        int g = c.get(Calendar.HOUR);
        int h = c.get(Calendar.MINUTE);
        int j = c.get(Calendar.MILLISECOND);
        
        

        System.out.println(year+"."+month+"."+day+" "+wday);
        System.out.println(k);

        
    }
}