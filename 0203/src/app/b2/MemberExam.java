package app.b2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberExam {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<Member>();
        Scanner s = new Scanner(System.in);
        Member m = null;
        for (;;) {
            String[] in = s.nextLine().split(",");
            if (in[0].equalsIgnoreCase("end")) {
                break;
            } 
            m = new Member(in);
            if(members.contains(m)){
                System.out.println("duplicate id");
            }
            else {
                members.add(m);
            }
        }
        System.out.println("\nid\tname\tage");
        new MemberData(members);
    }

    
}

/*
asdf,aaaa,20 
fda,bbbb,32 
jkl,asdf,40 
jkl,asff,41 
faa,eeee,39
end
*/
