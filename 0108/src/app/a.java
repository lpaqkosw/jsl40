package app;

import java.util.Scanner;

public class a {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int i=0;
        int max,min;
        int input;
        int[] arr = new int[7];
        int sum=0;

        while(i < 7){
            input = s.nextInt();
            if(input >0 && input <=10){
                arr[i] = input;
                i++;
                sum += input;
            }
            else if(input == -99) {
                break;
            }
            else{
                System.out.println("invalid input");
            }
        }

        max = arr[0];
        min = arr[0];
        for(int x =0; x < i; x++){
            if(arr[x] > max){
                max = arr[x];
            }
            if(arr[x] < min){
                min = arr[x];
            }
        }

        System.out.print("input: ");
        for(int x=0; x < i; x++){
            System.out.print(arr[x]+" ");
        }

        
        System.out.println("\nmax: "+ max);
        System.out.println("min: "+ min);
        System.out.println("sum: "+ (sum-max-min));



    }
}