package app.c;
//String to Date class
//SimpleDateFormat.parse();



import java.text.ParseException;
import java.text.SimpleDateFormat;

public class c1{
    public static void main(String[] args) throws ParseException{
        String date = "20200131";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println(sdf1.format(sdf.parse(date)));
        
        
    }
}