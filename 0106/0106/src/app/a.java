package app;

import java.util.Scanner;

public class a {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        int tcnt =-1;
        int pcnt=0;
        do{
            input = s.nextInt();
            tcnt++;
            if(input>=2 && input<=100){
                for(int j =2;j <= input; j++){
                    if(input%j ==0){
                        if(input == j){
                            pcnt++;
                            sum+=input;
                            System.out.println("prime: "+ pcnt);
                        }
                        break;
                    }  
                }
            }
            else if (input == -99){
                break;
            }
            else{
                System.out.println("error: invalid input\n");
            }
        }while (input != -99);

        System.out.println("# of inputs: "+ tcnt);
        System.out.println("# of prime: "+pcnt);
        System.out.println("sum of prime: "+sum);

    }
}