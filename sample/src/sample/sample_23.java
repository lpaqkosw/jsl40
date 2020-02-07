package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_23 {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int [] arr = new int[10];
       for(int i = 0; i < 10 ; i++){
           arr[i] = s.nextInt();
       }
       
       System.out.println(Arrays.toString(arr));

       for(int i = 0;i < arr.length -1;i++){
           for(int j =i+1; j<arr.length;j++){
               if(arr[i] > arr[j]){
                   int t = arr[i];
                   arr[i] = arr[j];
                   arr[j] = t;
               }
           }
       }

       System.out.println(Arrays.toString(arr));


       
   }
}


/*t c 1

1 2 3 6 5 10 50 60 30 23

*/