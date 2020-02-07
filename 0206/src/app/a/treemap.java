package app.a;
import java.util.Map;
//TreeMap
import java.util.TreeMap;

public class treemap{
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(new Integer(55), "aaaa");
        map.put(new Integer(44), "bbbb");
        map.put(new Integer(99), "cccc");
        map.put(new Integer(11), "dddd");
        map.put(new Integer(33), "eeee");

        System.out.println(map);
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.ceilingEntry(40));
        System.out.println(map.ceilingKey(40));
        System.out.println(map.floorEntry(40));
        System.out.println(map.floorKey(40));
        System.out.println(map.tailMap(40));
        
        Map.Entry<Integer,String> entry = null;
        entry = map.firstEntry();
        System.out.println(entry.getKey()+"\t"+entry.getValue());
        entry = map.lastEntry();
        System.out.println(entry.getKey()+"\t"+entry.getValue());
        entry = map.lowerEntry(40);
        System.out.println(entry.getKey()+"\t"+entry.getValue());
        entry = map.floorEntry(40);
        System.out.println(entry.getKey()+"\t"+entry.getValue());
        entry = map.higherEntry(40);
        System.out.println(entry.getKey()+"\t"+entry.getValue());
        entry = map.ceilingEntry(40);
        System.out.println(entry.getKey()+"\t"+entry.getValue());

        System.out.println();
        for(;!map.isEmpty();){
            entry = map.pollFirstEntry();
            System.out.println(entry.getKey()+"\t"+entry.getValue());
            System.out.print(map);
            System.out.println(map.size());
        }
    }
}