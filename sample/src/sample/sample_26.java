package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_26 {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int [] arr = new int[10];
       for(int i = 0; i < 10 ; i++){
           arr[i] = s.nextInt();
       }
       
       System.out.println(Arrays.toString(arr));

       for(int i = 1;i < arr.length;i++){
           int key = arr[i];
           
           for(int j =i-1; j>= 0;j--){
               if(key < arr[j]){
                   arr[j+1] = arr[j];
                   arr[j] = key;
               }
           }
       }

       System.out.println(Arrays.toString(arr));


       
   }
}


/*t c 1

45 23 86 41 2 27 66 30 81 15

*/