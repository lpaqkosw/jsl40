package app;

public class k {
    public static void main(String[] args) throws Exception {
        int[][] arr={{1,90,70,79,0,1},{5,10,30,80,0,1},{2,79,88,77,0,1},{4,78,53,65,0,1},{3,65,75,85,0,1}};
        double[] avg = new double[5];

        //total 계산
        System.out.println("id\tkor\teng\tmath\ttotal\tavg\trank");
        for (int i = 0; i <arr.length; i++){
            for(int j = 1; j<4;j++){
                arr[i][4] += arr[i][j];
            }
            avg[i] = (double)arr[i][4]/3;
        }

        //rank 계산
        for (int i = 0; i <arr.length; i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[i][4] > arr[j][4]){
                    arr[j][5]++;
                }
            }
        }


        //오리지널 출
        for (int i = 0; i < arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.printf(arr[i][j]+"\t");
                if(j == 4){
                    System.out.printf("%.2f\t",avg[i]);
                }
            }
            System.out.println();
            
        }

        //학번 정렬
        for(int i =0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int t;
                double avgt;
                if(arr[i][0] > arr[j][0]){
                    for(int k =0; k < arr[j].length; k++){
                        t = arr[i][k];
                        arr[i][k] = arr[j][k];
                        arr[j][k] = t; 
                    }
                    avgt = avg[i];
                    avg[i] = avg[j];
                    avg[j] = avgt;
                }
            }
        }

        //학번 정렬 출
        System.out.println("\nswapped: ");
        System.out.println("id\tkor\teng\tmath\ttotal\tavg\trank");
        for (int i = 0; i < arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.printf(arr[i][j]+"\t");
                if(j == 4){
                    System.out.printf("%.2f\t",avg[i]);
                }
            }
            System.out.println();
            
        }
    }
}