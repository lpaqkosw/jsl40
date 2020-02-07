package app.c;
//java.time.Local~ 


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class c2{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime ldt = LocalDateTime.now();
        LocalTime lt = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        
        System.out.println(date.toString());
        System.out.println(ldt.toString());
        System.out.println(lt.toString());
        System.out.println(ldt.format(dtf));
    }
}