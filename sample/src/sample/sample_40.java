package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sample_40 {
    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);
        int[] arr = new int [10];
        int i =-1;
        int m;
        int cnt =0;
        int n = s.nextInt();
        while(true){
            if(n/2 == 0){
                i++;
                arr[i] = n%2;
                cnt++;
                break;
            }
            
            else{
                m = n/2;
                i++;
                arr[i] = n%2;
                cnt++;
                n = m;
            }
        }



        for(int j =cnt-1; j >=0; j--){
            System.out.print(arr[j]);
        }
       
    }
}
