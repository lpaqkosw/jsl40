package app;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random ran = new Random();
        int[] arr = new int[6];

        for(int j = 0; j < 50; j++){
            for(int i = 0; i < arr.length; i++){
                arr[i] = ran.nextInt(45)+1;
                for(int k = 0; k < i; k++){
                    if(arr[k] == arr[i]){
                        i--;
                        break;
                    }
                }
            }
            System.out.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]);

        }

    }
}