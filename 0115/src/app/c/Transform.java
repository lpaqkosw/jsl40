package app.c;

public class Transform{
    public int dec;
    public int unit;
    

    public String conversion(){
        int[] arr = new int [10];
        int i =-1;
        String res="";
        while(true){
            
            if(this.dec/this.unit == 0){
                i++;
                arr[i] = this.dec%this.unit;
                break;
            }
            else{
                i++;
                arr[i] = this.dec%this.unit;
                this.dec = this.dec/this.unit;
            }
        }

            for(int k = i; k >=0;k--){
                if(arr[k] >= 10){
                    res+= (char)(arr[k] + 55);
                }
                else{
                    res += arr[k];
                }
            }
        
        return res;
    }

    public Transform(int dec, int unit) {
        this.dec = dec;
        this.unit = unit;
    }
}