package app;

import java.util.Scanner;

public class i {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[10];

        //입
        getInput(arr);

        //미정렬 출
        printArray("Source Data: ",arr);

        //정렬
        ascendSort(arr);
        System.out.println();

        //정렬 출
        printArray("Sorted Data: ", arr);
    }

    static void ascendSort(int[] a){
        for(int i =0; i < a.length-1; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[j] < a[i]){
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
    }

    static void printArray(String title, int[] a){
        System.out.println(title);
        for(int i =0 ; i < a.length; i++){
            System.out.print(a[i]+"\t");
        }
    }

    static void getInput(int[] a){
        Scanner s = new Scanner(System.in);
        for(int i =0 ; i < a.length; i++){
            a[i] = s.nextInt();
        }
        s.close();
    }

}
    

    
/*test case 1

32
45
65
87
98
52
54
53
12
56

*/


