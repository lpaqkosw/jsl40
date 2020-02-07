package app.d;

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
            if(str.equalsIgnoreCase("end")){                                            //break on "end"
                break;
            }
            else{
                String name = str;
                System.out.print("userId: ");
                String userId = s.next();
                if(Arrays.binarySearch(users, 0, cnt, new User(userId))>=0){            //id check
                    System.out.println("invalid id");
                    i--;
                    s.nextLine();
                    continue;
                } 
                System.out.print("email: ");
                String email = s.next();
                if(Pattern.matches("\\w+@\\w+.\\w+(\\.\\w+)?", email)==false){          //email format check
                    System.out.println("invalid email");
                    i--;
                    continue; 
                }
                users[i] = new User((i+1),name, userId, email);                         //create User
                cnt++;
                Arrays.sort(users, 0, cnt);                                             //sort by userId
            }
        }

        for(int i = 0; i < cnt; i++){                                                   //print sorted users
            users[i].print();                                                           
        }

        System.out.println("\nSearch ID: ");

        int index = Arrays.binarySearch(users, new User(s.next()));                     //Search by userId
        if(index > 0){                                                                  //if exists:
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


