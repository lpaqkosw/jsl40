package app.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        for (int i = 0; i < in.length; i++) {
            list.add(Integer.parseInt(in[i]));
        }
        System.out.print("Search: ");
        int search = s.nextInt();
        indicesOf(list, search);
    }



    
    /**
     *Finds the number of occurences of "search" inside "list"
     *and prints all the indices
     *@return void
     */
    public static void indicesOf(List<Integer> list, int search) {
        List<Integer> index = new ArrayList<Integer>();
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == search) {
                cnt++;
                index.add(i);
            }
        }
        if (index.isEmpty()) {
            System.out.println("there are no "  + "\""+search +"\""+ "s");
        } 
        else {
            System.out.print("\nthere are " + cnt + " " + "\""+search +"\"" + "s and the indices are: ");
            for (int i = 0; i < index.size(); i++) {
                if(i == index.size()-1){
                    System.out.println(index.get(i));
                }
                else{
                    System.out.print(index.get(i) + ", ");

                }
            }
        }
        /*
        *Helloworld
        */
    }
}

/*
89 84 90 77 95 90 65 100 90 84
*/