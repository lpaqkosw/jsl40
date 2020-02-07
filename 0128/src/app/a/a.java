package app.a;

import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        AlphaTest cnt = new AlphaTest();
        for(;;){
            String input = s.next();
            if(input.equalsIgnoreCase("end")){
                break;
            }
            else{
                cnt.countLetters(input.toUpperCase());
            }
        }
        s.close();
        cnt.print();
    }
}

//1230489ab098c21d13e908f890g9h9i9j9k9l9m9n9o0pqrs098tu123vw-09xy2314z