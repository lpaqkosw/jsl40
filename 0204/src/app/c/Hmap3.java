package app.c;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student {
    int id;
    String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+"\t"+name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            return id == ((Student)obj).id;
        }
        else{
            return false;
        }
    }
}


public class Hmap3{
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<String, Student>();
        
        
        map.put("A", new Student(1,"aaaaa"));
        map.put("b", new Student(1,"bbbbbb"));
        map.put("A", new Student(1,"ccccc"));
        System.out.println(map.size());
    
        Map<Student, Integer> map2 = new HashMap<Student, Integer>();
        map2.put(new Student(1,"aaaa"), 100);
        map2.put(new Student(2,"bbbb"), 88);
        map2.put(new Student(3,"dddd"), 90);
        map2.put(new Student(1,"aaaa"), 77);
        
        System.out.println(map2.size());
    }
}