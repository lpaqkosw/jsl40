package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_27 {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int [] arr = new int[10];
       int [] rank = new int[10];
       for(int i = 0; i < 10 ; i++){
           arr[i] = s.nextInt();
           rank[i] = 1;
       }

       
       
       System.out.println(Arrays.toString(arr));

       for(int i = 0;i < arr.length;i++){
           for(int j =0; j<arr.length; j++){
               if(arr[i] < arr[j]){
                   rank[i] += 1;
               }
           }
       }

       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(rank));


       
   }
}


/*t c 1

45 23 86 41 2 27 66 30 81 15

*/