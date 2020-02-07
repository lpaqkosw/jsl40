package app.a;

import java.util.Iterator;
import java.util.TreeSet;

//comparable interface
//comparator interface
class Person implements Comparable{
    String name;
    int age;

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.age - p.age;
        //return p.name.hashCode() - this.name.hashCode();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return age+":"+name;
    }

}

public class compare {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<Person>();
        set.add(new Person("aaaa", 50));
        set.add(new Person("dddd", 43));
        set.add(new Person("cccc", 77));
        set.add(new Person("bbbb", 22));
        System.out.println(set);

        Iterator<Person> i = set.iterator();
        for(;i.hasNext();){
            System.out.println(i.next());
        }
    }
}