package app;




public class m {
    public static void main(String[] args) throws Exception {
        int[][] arr = new int[5][5];
     //입
     int k = -1;
     int c = 1;
     int i = 0;
     int j = -1;
     int f = 4;

    while(true){
        for( int n = 0; n < f-1; n++){
            k++;
            j = j+c;
            arr[i][j]=k;
        }   

        f--;

        if(f >0){
            for(int n = 0; n < f; n++){
                k++;
                i = i+c;
                arr[i][j] = k;
            }
            c = -c;
        }
        else break;

    }
     //출
     for(int x = 0; x < arr.length; x++){
         for(int y =arr.length-1; y >= 0; y--){
             if(arr[x][y]==0){
                 System.out.print("\t");
             }
             else{
                 System.out.print(arr[x][y]+"\t");                   
             }
         }               
         System.out.println("");
     }
 }
    }


    
            
