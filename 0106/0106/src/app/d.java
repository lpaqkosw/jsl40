package app;

import java.util.Scanner;

public class d {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int i=0;
        int j=0;
        for(int y = 0; y<10; y++){
            int input = s.nextInt();
            if(input == -999){
                break;
            }
            int unit =50000;
            boolean sw = true;
            for(int x =1; x <=10; x++){
                    int n = input/unit;
                    switch(x){
                        case 1:{
                            a+=n;
                        }
                        case 2:{
                            b+=n;
                        }
                        case 3:{
                            c+=n;
                        }
                        case 4:{
                            d+=n;
                        }
                        case 5:{
                            e+=n;
                        }
                        case 6:{
                            f+=n;
                        }
                        case 7:{
                            g+=n;
                        }
                        case 8:{
                            h+=n;
                        }
                        case 9:{
                            i+=n;
                        }
                        case 10:{
                            j+=n;
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
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);
            System.out.println(i);
            System.out.println(j);
        }

        
}
