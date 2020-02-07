package app.a;

import java.util.HashSet;
import java.util.Set;

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+"   "+name;
    }

    @Override
    public boolean equals(Object anObject) {
        if(anObject instanceof Person){
            return this.id == ((Person) anObject).id;
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    
    
}
public class Se{
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        set.add(new Person(1,"AAA"));
        set.add(new Person(2,"BBB"));
        set.add(new Person(1,"AAA"));
        System.out.println(set);
    }
}