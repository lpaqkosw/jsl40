package app.b;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberExam {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<Member>();
        Scanner s = new Scanner(System.in);
        for (;;) {
            boolean flag = false;
            String[] in = s.nextLine().split(",");
            if (in[0].equalsIgnoreCase("end")) {
                break;
            } 

            for(int i = 0; i < members.size(); i++){
                if(members.get(i).id.equals(in[0])){
                    flag = true;
                }
            }
            
            if(flag == true){
                System.out.println("duplicate id");
            }
            else {
                members.add(new Member(in));
            }
        }
        s.close();
        System.out.println("\nid\tname\tage");
        for (Member member : members) {
            System.out.println(member);
        }
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
