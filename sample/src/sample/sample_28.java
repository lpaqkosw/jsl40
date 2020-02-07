package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_28 {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int [] arr = new int[10];
       for(int i = 0; i < 10 ; i++){
           arr[i] = s.nextInt();
       }

       int k = s.nextInt();

       int low = 1;
       int high = 10;
       
       while(true){
           if (low<=high){
               int mid = (int)((low+high)/2);
               if(k == arr[mid]){
                   System.out.println(mid+1);
                   break;
               }
               else if(k > arr[mid]){
                   low = mid +1;
               }
               else{
                   high = mid -1;
               }
            }
            else{
                System.out.println("fail");
                break;
            }
        }      
   }
}


/*t c 1

2 15 23 27 30 41 45 66 81 86

*/