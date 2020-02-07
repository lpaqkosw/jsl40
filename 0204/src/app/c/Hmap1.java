package app.c;

import java.util.HashMap;
import java.util.Map;

public class Hmap1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("java", "90");
        map.put("jsp", "96");
        map.put("servlet", "88");
        map.put("spring", "77");
        map.put("linux", "90");

        String s = "java";
        String p = "91";
        if (map.containsKey(s)) {
            if (map.get(s).equals(p)) {
                System.out.println("log in");
            } 
            else {
                System.out.println("wrong id/pw");
            }
        } 
        else {
            System.out.println("no id");
        }
    }
}