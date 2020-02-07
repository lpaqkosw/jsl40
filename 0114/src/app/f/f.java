package app.f;

import java.util.Scanner;

public class f{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[11];
        int i; 

        //입
        for(i =0;i < num.length-1;i++){
            int input = s.nextInt();
            if(input == -99) break;
            else{
                num[i] = input;
            }
        }
        num[num.length-1] = i;
        
        //객체생성
        Sort a = new Sort();
        System.out.println();

        //미정렬 출
        a.printArr(num);

        //오름차순 정렬
        a.sorter(num);

        //정렬 출
        a.printArr(num);

        
    }
}

/*

4 8 5 21 56 987 45 21 1 23

*/