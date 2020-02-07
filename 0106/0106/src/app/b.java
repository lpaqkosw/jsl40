package app;

import java.util.Scanner;

public class b {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int input;
        do{
            // int sum = 0;
            int pcnt=0;
            int sp=0;
            input = s.nextInt();
            if(input>=2 && input<=1000){
                for( int i =0; i <= input; i++){
                    for(int j =2;j <= i; j++){
                        if(i%j ==0){
                            if(i == j){
                                pcnt++;
                                // sum+=i;
                                System.out.print(i+"\t");
                                sp++;
                                if(sp==5){
                                    System.out.print("\n");
                                    sp=0;
                                }
                            }
                            break;
                        }  
                    }
                }
            }
            if(input == 0){
                break;
            }
            System.out.println("\n");
            System.out.println("# of prime: "+pcnt+"\n");
            // System.out.println("sum of prime: "+sum+"\n");
        }while(input != 0);
        

    }
}