package app.c;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class c{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] names = {"Alice", "Peter", "Andy", "David", "Tom", "Bob", "Paul", "Karen", "Cindy", "Sally", "Sue"};
        Integer[] ages = {23,19,25,19,22,31,25,40,30,28,32};
        for(int i = 0; i<names.length;i++){
            map.put(names[i], ages[i]);
        }
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String search = s.next();
        if(map.get(search) != null ){
            System.out.println(search+" is "+ map.get(search)+ " years old");
        }
        else{
            System.out.println("not found");
        }
    }
}