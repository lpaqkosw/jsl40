package app;

import java.util.Scanner;

public class c {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int input;
        int unit;
        int[] arr = new int[10];

        while(true){
            input = s.nextInt();
            unit = s.nextInt();
            
            if(input == -99){
                break;
            }
            else if (input >=2 && input < 1024){
                int x =0;
                while(input!=0){
                    arr[x] = input%unit;
                        x++;
                    input = input/unit;
                }
                for(int i = x-1; i >=0; i--){
                System.out.print(arr[i]);
                }
                System.out.println();
            }
            else{
                System.out.println("invalid input");
            }
        }

        


    }
}