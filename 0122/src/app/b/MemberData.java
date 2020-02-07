package app.b;

public class MemberData{
    Member[] members;
    int cnt;

    public MemberData(Member[] members, int cnt) {
        this.members = members;
        this.cnt = cnt;
    }

    public void print(){
        System.out.println("\nname\tphone\t\tsex\tage");
        for(int i = 0; i < cnt;i++){
            System.out.println(members[i]);
        }

    }
}