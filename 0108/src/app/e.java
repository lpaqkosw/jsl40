package app;

import java.util.Scanner;

public class e {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] score = {50,70,60,90,80,77,45,78};
        
        for(int i =0; i < score.length; i++){
            System.out.print(score[i]+" ");
        }

        for(int i =0; i<score.length-1;i++){
            for(int j = i+1; j <score.length;j++){
                if(score[i]>score[j]){
                    int t = score[i];
                    score[i] = score[j];
                    score[j] = t;
                }
            }
        }

        System.out.println("");
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i]+" ");
        }
        


    }
}