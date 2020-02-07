package app.d;

import java.util.Random;

public class d{
    public static void main(String[] args) {
        int[] lotto = new int[6];
        Random r = new Random();
        int cnt=0;
        while(cnt<lotto.length){
            boolean bool = true;
            int su = r.nextInt(45)+1;
            for(int x= 0; x<cnt; x++){
                if(su == lotto[x]){
                    bool = false;
                    break;
                }
            }
            if(bool){
                lotto[cnt] = su;
                cnt++;
            }
        }

        for(int i =0; i <lotto.length; i++){
            System.out.print(lotto[i]+"\t");
        }
    }
}