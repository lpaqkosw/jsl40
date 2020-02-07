package app.c;

import java.util.StringTokenizer;

//StringTokenizer
public class c{
    public static void main(String[] args) {
       String str = "010 1111.2222";
       StringTokenizer st = new StringTokenizer(str,"-. ");
       //while(st.hasMoreTokens()){
           System.out.println(st.nextToken());
      // }
    }
}