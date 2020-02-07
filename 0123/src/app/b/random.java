package app.b;

import java.util.ArrayList;

public class random{
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int cnt =0;
        for(int i = 0; i < 6;){
            boolean flag = false;
            int tmp = (int)(Math.random()*45+1);
            for(int j = 0;j<i;j++){
                if(tmp==lotto[j]){
                    flag = true;
                    cnt++;
                }
            }
            if(flag == false){
                lotto[i] = tmp;
                i++;
            }
        }
        for(int i = 0; i <lotto.length;i++){
            System.out.println(lotto[i]);
        }
        System.out.println("\n"+cnt);
        
    }
}