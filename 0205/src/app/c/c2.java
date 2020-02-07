package app.c;

import java.util.ArrayList;
import java.util.List;

public class c2 {
    public static void main(String[] args) {
        String[] in = { "hello" ,"tall", "school","hi", "hey"};
        List <String> words = new ArrayList<String>();
        List<String> longest = new ArrayList<String>();
        int maxL =0;
        for(int i =0; i< in.length; i++){
            words.add(in[i]);
        }

        for(int i =0; i<words.size();i++){
            if(words.get(i).length() > maxL){
                maxL = words.get(i).length();
                longest.clear();
                longest.add(words.get(i));
            }
            else if(words.get(i).length()==maxL){
                longest.add(words.get(i));
            }
            }
        }
    }