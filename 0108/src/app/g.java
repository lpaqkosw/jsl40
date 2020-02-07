package app;


public class g {
    public static void main(String[] args) throws Exception {
        int[] num = {5,3,1,4,2};
        int[] score = {50,70,60,90,80};

        for(int i =0; i<num.length-1;i++){
            for(int j = i+1; j <num.length;j++){
                if(num[i]>num[j]){
                    int t = num[i];
                    num[i] = num[j];
                    num[j] = t;
                    int st = score[i];
                    score[i] = score[j];
                    score[j] = st;
                }
            }
        }

        System.out.println("");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]+"\t");
        }
        System.out.println("");
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i]+"\t");
        }
        


    }
}