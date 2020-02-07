package app;

public class a {
    public static void main(String[] args) throws Exception {
        int[][] arr={{1,90,70,79},{5,10,30,80},{2,79,88,77},{4,78,53,65},{3,65,75,85}};

        //출
        System.out.println("id\tkor\teng\tmath");
        for (int i = 0; i < arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();
        }
    }
}