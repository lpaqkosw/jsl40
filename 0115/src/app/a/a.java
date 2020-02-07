package app.a;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //입
        for(int i = 0; i < 10;i++){
            int b = s.nextInt();
            String na = s.next();
            int k = s.nextInt();
            int e = s.nextInt();
            int m = s.nextInt();
    
            //출
            Student st = new Student(b,na,k,e,m);
            st.print();
        }


    }
}


/* tc1

1 aaaa 50 60 50

*/

/* tc1

3 aaba 78 54 32

*/