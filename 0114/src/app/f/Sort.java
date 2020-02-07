package app.f;

public class Sort{

    public void sorter(int[] arr){
        for(int i = 0; i< arr[arr.length-1]; i++){
            for(int j = i+1; j<arr[arr.length-1];j++){
                if(arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

    }

    public void printArr(int[] arr){
        for(int i = 0; i < arr[arr.length-1]; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    
}