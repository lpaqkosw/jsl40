package app.b2;

import java.util.List;

public class MemberData {
    List list;

    MemberData(){}
    MemberData(List list){
        this.list = list;
        memberPrint();
    }

    private void memberPrint(){
        for (Object object : list) {
            System.out.println((Member) object);
        }
    }
}