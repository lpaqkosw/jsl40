package app.e;

import java.util.Random;
import java.util.Scanner;

public class e{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random ran = new Random();
        int[] lot = new int[7];
        // int[] lot = {14,15,16,24,25,11,33}; //=======test
        int n = s.nextInt();
        s.nextLine();
        Lotto[] players = new Lotto[n];
        
        //lotto lot init
        for(int i = 0; i < lot.length;i++){
            lot[i] = ran.nextInt(45)+1;
            for(int j = 0; j < i; j++){
                if(lot[j]==lot[i]){
                    i--;
                    break;
                }
            }
        }
    

        //player random Input
        for(int i = 0; i < n; i++){
            int[] playerLot = new int[6];
            for(int j =0; j< playerLot.length;j++){
                playerLot[j] = ran.nextInt(45)+1;
                for(int k = 0; k < j; k++){
                    if(playerLot[k] == playerLot[j]){
                        j--;
                        break;
                    }
                }
            } 
            players[i] = new Lotto(lot,playerLot,(i+1));
        }
        

            
        int five = 0;
        int four = 0;
        int three = 0;
        int two = 0;
        int one = 0;
            //playerLot print
            for(int i = 0;i < n; i++){
                players[i].print();
                if(players[i].rank > 0 && players[i].rank == 1){
                    one++;
                    break;
                }
                if(players[i].rank == 5){
                    five++;
                }
                if(players[i].rank == 4){
                    four++;
                }
                if(players[i].rank == 3){
                    three++;
                }
                if(players[i].rank == 2){
                    two++;
                }
            }
            //lot print
            System.out.print("\n   ");
            for(int i = 0; i < lot.length; i++){
                if(i == 6){
                    System.out.print("  --  "+ lot[i]);
                    break;
                }
                if(i == 5){
                    System.out.print(lot[i]);
                }
                else{
                    System.out.print(lot[i]+", ");
                }
            }

            System.out.println("\n"+five+"\t"+four+"\t"+three+"\t"+two+"\t"+one);
        }
}


/* original
6
14,15,16,24,25,45
14,15,16,24,25,11
14,15,16,24,45,42
14,15,16,22,26,45
33,15,16,24,25,11
14,33,16,42,43,45

*/

/* invalid integer - NumberFormatException
6
14,15,16,24,25,45
14,15,16,24,25,11
14,15,1a,24,45,42
14,15,16,22,26,45
33,15,16,24,25,11
14,33,16,42,43,45
14,33,16,42,43,41

*/

/* invalid integer - Exception(x > 45 && x < 0)
6
14,15,16,24,25,45
14,15,16,24,25,11
14,15,16,24,45,42
14,15,16,22,55,45
33,15,16,24,25,11
14,33,16,42,43,45


*/

/*
50
43,1,17,31,30,13
12,28,21,14,18,3
16,25,38,26,10,19
24,28,27,18,45,25
1,38,18,45,24,3
39,32,4,7,27,31
23,15,20,18,14,3
8,24,18,9,12,40
9,36,24,5,4,40
27,26,10,16,23,40
24,10,43,25,16,21
3,15,31,19,1,16
11,7,4,36,2,40
1,36,44,22,29,8
39,36,41,29,10,3
7,27,17,9,5,34
29,43,6,35,22,11
27,2,20,34,26,15
7,40,24,36,41,12
3,30,29,17,15,14
34,20,36,22,16,14
20,9,42,31,15,35
22,36,5,18,35,29
45,35,44,31,13,23
5,32,39,43,12,37
18,21,6,11,42,40
14,23,25,18,37,44
1,24,32,27,20,36
15,6,24,41,14,11
5,15,24,21,32,25
44,32,7,36,10,41
25,12,35,45,2,28
4,12,24,20,38,25
27,42,30,22,25,35
26,41,7,11,2,32
27,31,8,30,4,12
18,8,11,30,33,35
5,20,2,33,30,38
40,32,21,39,19,35
1,39,43,12,23,34
38,25,5,29,4,32
28,17,12,3,37,29
16,26,40,29,45,12
34,27,29,21,24,35
9,8,7,37,17,13
24,19,8,27,1,25
40,25,36,27,42,16
12,40,45,24,20,27
45,43,12,14,32,16
21,4,29,37,38,15

*/

