package books.main;

import java.util.HashMap;
import java.util.Set;

public class exmain {
    public static void main(String[] args) {
        int res = ex(new int[]{3,8,9,7,6});
        System.out.println(res);
    }

    public static int ex(int[] A) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            }
            else{
                map.put(A[i], 0);
            }
        }

        Set set = map.entrySet();
        
        return null;
        
    }
}