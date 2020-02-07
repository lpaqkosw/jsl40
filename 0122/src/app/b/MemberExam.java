package app.b;

import java.util.Scanner;

public class MemberExam{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Member[] members = new Member[10];
        int cnt=0;
        for(int i =0;i<members.length;i++){
            String[] arr = s.nextLine().split(",");
            if(arr[0].equalsIgnoreCase("end")){
                break;
            }
            else{
                cnt++;
                String name = cnt<10 ? arr[0].substring(2):arr[0].substring(3);
                members[i] = new Member(name, arr[2], arr[1]);
            }
        }
        MemberData data = new MemberData(members, cnt);
        data.print();
    }
}

/*
1:aaaa,900206-1,010-2242-3810
2:bbbb,071015-4,010-1111-2222
3:cccc,890723-1,010-2222-3333
4:dddd,651201-5,010-3333-4444
5:eeee,071201-3,010-3336-4444
6:ffff,341201-2,010-3353-4444
7:gggg,541201-6,010-3433-4744
8:hhhh,651201-6,010-2333-4484
9:iiii,755301-5,010-3363-4449
10:jjjj,995301-1,010-2343-6549
*/

/*
1:aaaa,900206-1,010-2242-3810
2:bbbb,071015-4,010-1111-2222
3:cccc,890723-1,010-2222-3333
4:dddd,651201-5,010-3333-4444
end
*/