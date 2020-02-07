package app.b;

import java.util.Arrays;

public class b{
    public static void main(String[] args) {
        int[] arr = {90,87,95,80,75,60};
        int var[][] = {{1,90,80,70},{4,88,78,68},{2,70,90,80}};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        Arrays.parallelSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        Arrays.sort(arr);

    }
}