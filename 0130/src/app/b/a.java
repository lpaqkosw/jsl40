package app.b;
//Arrays class

import java.util.Arrays;

public class a{
    public static void main(String[] args) {
        int [] var = {1,2,3,4,5,6};
        int[] str = Arrays.copyOf(var, 6);
        for(int i = 0; i <str.length;i++){
            System.out.print(str[i]+"\t");
        }
        System.out.println();
        System.out.println(var.equals(str));
        System.out.println(Arrays.equals(var, str));
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(var));
    }
}