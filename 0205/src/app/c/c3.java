package app.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c3 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<String> list = new ArrayList<String>(Arrays.asList("rose","candle","paper","book","song","candle","berry","paper","berry","song","paper","rose","song","lion","berry","rose","book","rose","rose"));
        for(int i =0;i<list.size();i++){
            if(!map.containsKey(list.get(i))){
                map.put(list.get(i), 1);
            }
            else{
                map.put(list.get(i), map.get(list.get(i))+1);
            }
        }

        Set<String> set = new HashSet<>(map.keySet());
        for (String str : set) {
            System.out.println(str+": "+map.get(str));
            
        }

            
        }
            
}