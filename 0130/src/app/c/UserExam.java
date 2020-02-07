package app.c;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserExam{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        User[] users = new User[10];
        int cnt=0;
        
        for(int i = 0; i < users.length; i++){
            System.out.print("\nname: ");
            String str = s.next();
            if(str.equalsIgnoreCase("end") || str.equalsIgnoreCase(null)){              //break on "end"
                break;
            }
            else{
                String name = str;
                System.out.print("userId: ");
                String userId = s.next();
                System.out.print("email: ");
                String email = s.next();
                try {                                                                   //email format check
                    if(Pattern.matches("\\w+@\\w+.\\w+(\\.\\w+)?", email)==false){  
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("invalid email");
                    i--;
                    continue;                    
                }

                users[i] = new User((i+1),name, userId, email);                         //create User
                cnt++;
                for(int j = 0; j<i;j++){                                                //id check
                    if(users[i].equals(users[j])){
                        i--;
                        cnt--;
                        System.out.println("invalid id");
                        break;
                    }
                }
            }
        }

        Arrays.sort(users, 0, cnt);                                                     //sort by userId
        for(int i = 0; i < cnt; i++){
            users[i].print();                                                           //print sorted users
        }

        System.out.println("\nSearch ID: ");
        int index = Arrays.binarySearch(users, 0, cnt, new User(s.next()));             //Search by userId

        if(index > 0){
            System.out.println("index: "+ index);
            users[index].print();                                                       //print searched user if exists
        }
        else{
            System.out.println("not found");
        }

    }
}


/*
aaaa a123 asdf@asdf.com
cccc a789 csdf@csdf.com
bbbb a456 bsdf@bsdf.com
end
*/


/* error: invalid id
aaaa a123 asdf@asdf.com
cccc a789 csdf@csdf.com
bbbb a456 bsdf@bsdf.com
dddd a456 dsdf@dsdf.com
eeee 0123 esdf@esdf.com
end
*/

/* error: invalid email
cccc a789 csdf@csdf.com
bbbb a456 bsdf@bsdf.com
aaaa a123 asdf@asdf.com.asdf.asdf
dddd a123 dsdf@dsdf.com
eeee 0123 esdf@esdf.com
end
*/


