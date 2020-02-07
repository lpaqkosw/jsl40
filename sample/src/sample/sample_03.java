package sample;

import java.util.Scanner;

public class sample_03 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i =0; i< arr.length; i++){
            arr[i] = s.nextInt();
        }
        
        for(int i =0; i < arr.length-1; i++){
            for(int j =1+i; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("min : " + arr[0]);
        System.out.println("med : " + arr[1]);
        System.out.println("max : " + arr[2]);


    }
}