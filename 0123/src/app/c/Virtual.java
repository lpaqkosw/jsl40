package app.c;

import java.util.Scanner;

public class Virtual{
    public static void roll(){
        Scanner s = new Scanner(System.in);
        int[] game = new int[6];
        
        int n = s.nextInt();
        for(int i = 0; i<n;i++){
            int[] cnt = new int[45];
            int[] index = new int[45];

            //initialize index[]
            for(int b = 0; b < index.length;b++){
                index[b]=b+1;
            }

            //roll 100sets and get cnt[]
            for(int x = 0; x < 100; x++){
                for(int j = 0; j <game.length;j++){
                    game[j] = (int)(Math.random()*45)+1;
                    cnt[game[j]-1]++;
                    for(int k = 0; k < j;k++){
                        if(game[j] == game[k]){
                            cnt[game[j]-1]--;
                            j--;
                            break;
                        }
                    }
                }
            }
            
            //cnt[] index[] sort
            for(int k = 0; k<cnt.length-1;k++){
                for(int j = k+1; j<cnt.length;j++){
                    if(cnt[k]<cnt[j]){
                        int tmp = cnt[k];
                        cnt[k] = cnt[j];
                        cnt[j] = tmp;
                        int tmpI = index[k];
                        index[k] = index[j];
                        index[j] = tmpI;
                    }
                }
            }

            
            //get numbers from index[]
            System.out.println((i+1)+": most frequent num");
            for(int a = 0; a<game.length;a++){
                System.out.print(index[a]+"\t");
            }
            System.out.println();
            for(int a = 0; a<game.length;a++){
                System.out.print(cnt[a]+"\t");
            }
            System.out.println("\n----------------------------------------------------------");

        }
    }
}