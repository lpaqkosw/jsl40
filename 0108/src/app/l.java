package app;



public class l {
    public static void main(String[] args) throws Exception {
        
    }

    static void sixtyone(){
        //입
        int[][] arr = new int[5][5];
        int num = 0;
        int x =5;
        boolean sw = true;
        int j= 0;
        int cnt =0;
        
        while(true){
            if(sw == true){
                for (int i= 0; i < x-1;i++){
                    num++;
                    arr[i][j] = num;
                    j++;
                    if(i == x-1){
                        for(int k = 6-x; k < x-1; k++){
                            num++;
                            arr[k][i] = num;
                        }
                        x--;
                        sw=false;
                    }
                }
            }
            if(sw ==false){
                for (int i= x-1; i > 4 -x;i--){
                    num++;
                    arr[x][i] = num;
                    if(i == 4-x){
                        for(int k = x-1; k > 5-x; k--){
                            num++;
                            arr[k][i] = num;
                            x--;
                        }
                    }
                }
           }
           if(x<0)break;
}
    }
}

    
            
