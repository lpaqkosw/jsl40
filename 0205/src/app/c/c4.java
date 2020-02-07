package app.c;

import java.util.LinkedList;
import java.util.Queue;

public class c4 {
    public static void main(String[] args) {
        String[] in = {"2a5b1c","3x5y2z", "2m4n", "9o"};
        for(int i = 0; i < in.length;i++){
            System.out.print(in[i]+": ");
            System.out.println(uncompress(in[i]));
        }

    }

    public static String uncompress(String in){
       Queue<String> q = new LinkedList();
       StringBuilder sb = new StringBuilder();

       for(int i =0; i < in.length();i++){
            q.offer(in.substring(i, i+1)); 
       }
       for(;!q.isEmpty();){ 
           int num = Integer.parseInt(q.poll());
           String a = q.poll();
           for(int i = 0; i<num;i++){
               sb.append(a);
           }
       }
        return sb.toString();
    }


}