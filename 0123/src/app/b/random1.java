package app.b;

public class random1{
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int cnt=0;
        
        for(int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random()*45)+1;
            for(int j = 0; j<i;j++){
                if(lotto[j]==lotto[i]){
                    cnt++;
                    i--;
                    break;
                }
            }
        }

        for(int i =0;i<lotto.length;i++){
            System.out.println(lotto[i]);
        }
        System.out.println(cnt);
    }
}