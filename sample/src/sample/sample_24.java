package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_24 {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int [] arr = new int[10];
       for(int i = 0; i < 10 ; i++){
           arr[i] = s.nextInt();
       }
       
       System.out.println(Arrays.toString(arr));

       for(int i = 0;i < arr.length-1;i++){
           for(int j =0; j<arr.length-1-i;j++){
               if(arr[j] > arr[j+1]){
                   int t = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = t;
               }
           }
       }

       System.out.println(Arrays.toString(arr));


       
   }
}


/*t c 1

45 23 86 41 2 27 66 30 81 15

*/