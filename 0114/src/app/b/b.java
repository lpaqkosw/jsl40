package app.b;

import java.util.Scanner;

public class b {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        for(int j = 0;;){
            int num = s.nextInt();
            if(num == -1){
                break;
            }
            Mouse a = new Mouse(num, false, "black");
            System.out.println(a.toString());

            for(int i =0;;i++){
                int input = s.nextInt();
                if(input == -1){
                    break;
                }
                a.buttonClick(input);
            }
            
        }
    }
}