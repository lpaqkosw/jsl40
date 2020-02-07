package app;

import java.util.Scanner;

public class b {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int x=0;
        int input;
        int[] arr = new int[10];

        while(true){
            input = s.nextInt();
            if(input == -99){
                break;
            }
            else if (input >=2 && input <= 1024){
                while(true){
                    arr[x] = input%2;
                    x++;
                    input = input/2;
                    if(input/2 ==0 && input%2==1){
                        arr[x] = input%2;
                        break;
                    }
                }
                for(int i = x; i >=0; i--){
                System.out.print(arr[i]);
                }
            }
            else{
                System.out.println("invalid input");
            }
        }

        


    }
}