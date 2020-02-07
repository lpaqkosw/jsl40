package app.b;

import java.util.Scanner;

public class b{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String user = s.next();
        int start = s.nextInt();
        int end = s.nextInt();
        
        Sum a = new Sum(user,start,end);
        a.print();

    }
}


/*
aaaa 5 20
ȫ�浿 10 100
*/