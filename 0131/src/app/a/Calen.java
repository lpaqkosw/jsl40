package app.a;

import java.util.Calendar;

public class Calen{
    public static void main(String[] args) {
        if(args.length !=2){
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set(year, month-1,1);
        eDay.set(year, month-1,sDay.getActualMaximum(Calendar.DATE));
        sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK)+1);
        eDay.add(Calendar.DATE, 7-eDay.get(Calendar.DAY_OF_WEEK));

        System.out.println("\n                     "+year+"."+month+"\n");
        System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");
        
        for(int n = 1; sDay.before(eDay) || sDay.equals(eDay);sDay.add(Calendar.DATE,1)){
            int day = sDay.get(Calendar.DATE);
            System.out.print(day+"\t");
            if(n++%7 ==0){
                System.out.println();
            }
        }
    }
}