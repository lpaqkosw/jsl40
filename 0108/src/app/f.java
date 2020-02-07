package app;

import java.util.Scanner;

public class f {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] score = {50,70,60,90,80,77,45,78};
        
        for(int i =0; i < score.length; i++){
            System.out.print(score[i]+" ");
        }

        for(int i =0; i<score.length-1;i++){
            for(int j = 0; j <score.length-1-i;j++){
                if(score[j]>score[j+1]){
                    int t = score[j];
                    score[j] = score[j+1];
                    score[j+1] = t;
                }
            }
        }

        System.out.println("");
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i]+" ");
        }
        


    }
}