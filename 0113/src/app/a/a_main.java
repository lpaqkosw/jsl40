package app.a;


public class a_main{
    public static void main(String[] args) {
        Student[] a = new Student[5];
        for(int i = 0; i < a.length;i++){
            a[i] = new Student(i, "a", i, i, i);
            a[i].calcTot();
            a[i].calcAvg();
        }

        for(int i = 0; i < a.length;i++){
            a[i].printData();
        }
        
    }
} 
