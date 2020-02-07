package app.a;

public class g{
    public static void main(String[] args) {
        int[][] var = {{1,2,3},{4,5,6}};
        int[][] str = new int[3][10];

        System.arraycopy(var, 0, str, 0, var.length);
        for(int i = 0; i < str.length;i++){
            for(int j = 0; j < str[i].length;j++){
                System.out.print(str[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i = 0; i < str.length;i++){
            for(int j = 0; j < str[i].length;j++){
                System.out.print(                str[i][j]+"\t");
            }
            System.out.println();
        }
    }
}