package app.d;


public class d_main{
    public static void main(String[] args) {
        int[][] arr = {{1,90,89,79},{2,55,66,77},{3,56,78,89},{4,78,78,68}};
        String[] name = {"AAAA", "BBBB", "CCCC", "DDDD"};
        Student[] students = new Student[4];
        
        for(int i = 0; i < arr.length; i++){
            students[i] = new Student(arr[i],name[i]);
            students[i].calcTot();
            students[i].calcAvg();
        }

        System.out.println("id\tname\tkor\tmath\teng\ttot\tavg");

        for(int i = 0; i < arr.length; i++){
            students[i].printData();
        }
    }
} 
