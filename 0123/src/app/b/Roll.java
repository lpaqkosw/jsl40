package app.b;

import java.util.Scanner;

public class Roll {
    public static void rollLotto(){
        Scanner s = new Scanner(System.in);
        int[] lotto = new int[6];
        int n = s.nextInt();
        for(int i = 0; i < n;i++){
            for(int j = 0; j <lotto.length;j++){
                lotto[j] = (int)(Math.random()*45)+1;
                for(int k = 0; k < j;k++){
                    if(lotto[j] == lotto[k]){
                        j--;
                        break;
                    }
                }
            }

            for(int j = 0; j<lotto.length-1;j++){
                for(int k =j+1;k<lotto.length;k++){
                    if(lotto[j]>lotto[k]){
                        int tmp = lotto[k];
                        lotto[k] = lotto[j];
                        lotto[j] = tmp;
                    }
                }
            }
            System.out.print((i+1)+":\t");
            for(int j = 0; j<lotto.length;j++){
                System.out.print(lotto[j]+"\t");
            }
            System.out.println();
        }
        
    }
}