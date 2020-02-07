package app;

import java.util.Scanner;

public class e {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int a =0;
        int b =0;
        int c =0;
        int d =0;
        int e =0;
        int f =0;
        int g =0;
        int h =0;
        int i =0;
        int j =0;
        for(int x = 0; x<10;x++){
            int input = s.nextInt();
            if(input == -999)break;
            int unit =50000;
            boolean sw = true;
            for(int y =1; y <=10; y++){
                int n = input/unit;
                switch(y){
                    case 1:{
                        a+=n;
                        break;
                    }
                    case 2:{
                        b+=n;
                        break;
                    }
                    case 3:{
                        c+=n;
                        break;
                    }
                    case 4:{
                        d+=n;
                        break;
                    }
                    case 5:{
                        e+=n;
                        break;
                    }
                    case 6:{
                        f+=n;
                        break;
                    }
                    case 7:{
                        g+=n;
                        break;
                    }
                    case 8:{
                        h+=n;
                        break;
                    }
                    case 9:{
                        i+=n;
                        break;
                    }
                    case 10:{
                        j+=n;
                        break;
                    }
                    
                    
                }
                if(sw){
                    input = input%unit;
                    unit=unit/5;
                    sw = false;
                }
                else{
                    input = input%unit;
                    unit=unit/2;
                    sw = true;
                }
            }

        }
        System.out.println("50000: "+a);
        System.out.println("10000: "+b);
        System.out.println("5000: "+c);
        System.out.println("1000: "+d);
        System.out.println("500: "+e);
        System.out.println("100: "+f);
        System.out.println("50: "+g);
        System.out.println("10: "+h);
        System.out.println("5: "+i);
        System.out.println("1: "+j);

    }
}