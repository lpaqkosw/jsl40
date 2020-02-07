package app.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Member implements Comparable {
    String id;
    String name;
    int age;

    Member() {
    }

    public Member(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            return this.id.equals(((Member) obj).id);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + age;
    }

    @Override
    public int compareTo(Object o) {
        Member m = (Member) o;
        return this.name.compareTo(m.name);

    }
}

public class Mem {
    public static void main(String[] args) {
        Set<Member> members = new HashSet<Member>();
        Scanner s = new Scanner(System.in);
        for (;;) {
            String[] in = s.nextLine().split(",");
            if (in[1].equalsIgnoreCase("end")) {
                break;
            }
            if(members.add(new Member(in[0], in[1], Integer.parseInt(in[2])))==false){
                System.out.println("duplicate id");
            }
        }

        System.out.println("id\tname\tage");
        for (Member member : members) {
            System.out.println(member);
        }

        System.out.println("\nid\tname\tage");
        List<Member> list = new ArrayList<Member>(members);
        Collections.sort(list);
        for (Member member : list) {
            System.out.println(member);
        }
    }
}

/*
ASDF,aaaa,23
fdsa,bbbb,54
asdf,aaaa,43
asdf,cccc,65
jil,vcxz,34
fdsa,eeee,11
,end,
 */
