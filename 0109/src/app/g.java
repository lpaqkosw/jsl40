package app;

public class g {
    public static void main(String[] args) throws Exception {
        int[][] arr={{1,90,70,79,0},{5,10,30,80,0},{2,79,88,77,0},{4,78,53,65,0},{3,65,75,85,0}};

        //계산
        System.out.println("id\tkor\teng\tmath\ttotal");
        for (int i = 0; i <arr.length; i++){
            for(int j = 1; j<4;j++){
                arr[i][4] += arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        //swap
        for(int i =0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int t;
                if(arr[i][0] > arr[j][0]){
                    for(int k =0; k < arr.length; k++){
                        t = arr[i][k];
                        arr[i][k] = arr[j][k];
                        arr[j][k] = t; 

                    }
                }
            }
        }

        //출
        System.out.println("\nswapped: ");
        for (int i = 0; i < arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}