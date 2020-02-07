package app;



public class j {
    public static void main(String[] args) throws Exception {
        one();
        System.out.println("\n");
        two();
        System.out.println("\n");
        three();
        System.out.println("\n");
        four();
        System.out.println("\n");
        five();
        System.out.println("\n");

    }
    static void one(){     
        int[][] arr = new int[5][5];
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length; j++){
                num++;
                arr[j][i] = num;             
             }         
        }
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+"\t");               
            }            
            System.out.println("");
        }
    }
    // one end;

    static void two(){
        //입
        int[][] arr = new int[5][5];
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < i+1; j++){
                num++;   
                arr[i][j] = num;
            }
        }
        
        //출
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length; j++){
                if(arr[i][j]!=0){
                    System.out.print(arr[i][j]+"\t");                   
                }
            }               
            System.out.println("");
        }
    }
    //two end;


    static void three(){
        //입
        int[][] arr = new int[5][5];
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            for(int k = arr.length-1-i; k < arr.length; k++){
                num++;
                arr[i][k] = num; 
            }
        }
                
        //출
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length; j++){
                if(arr[i][j]==0){
                    System.out.print("\t");
                }
                else{
                    System.out.print(arr[i][j]+"\t");                   
                }
            }               
            System.out.println("");
        }
    }
    //three end;

    static void four(){
        //입
        int[][] arr = new int[5][5];
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            for(int k = arr.length -1-i; k < arr.length; k++){
                num++;
                arr[i][k] = num; 
            }
        }
        
        //출
        for(int i = 0; i < arr.length; i++){
            for(int j =arr.length-1; j >= 0; j--){
                if(arr[i][j]==0){
                    System.out.print("\t");
                }
                else{
                    System.out.print(arr[i][j]+"\t");                   
                }
            }               
            System.out.println("");
        }
    }
    //four end;

    static void five(){
        //입
        int[][] arr = new int[5][5];
        int num = 0;
        //boolean sw = false;
        for(int i = 0; i < arr.length; i++){
            if(i%2!=0){
                for(int j =0; j < arr[0].length; j++){
                    num++;
                    arr[i][j] = num;
                    //sw = false;
                }
            }
            else{
                for(int j = arr.length -1; j >=0;j--){
                    num++;
                    arr[i][j] = num;
                    //sw = true;
                }
            }
            
        }
        
        //출
        for(int i = 0; i < arr.length; i++){
            for(int j =arr.length-1; j >= 0; j--){
                if(arr[i][j]==0){
                    System.out.print("\t");
                }
                else{
                    System.out.print(arr[i][j]+"\t");                   
                }
            }               
            System.out.println("");
        }
    }

}



                