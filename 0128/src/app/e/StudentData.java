package app.e;

public class StudentData{
    Student[] students;
    int cnt;
    int ans[];
    double ratio[] = new double[20];

    public StudentData(Student[] students, int cnt,int[] ans) {
        this.students = students;
        this.cnt = cnt;
        this.ans = ans;
        mark();
        sortStudents();
    }

    public void mark(){
        for(int i =0;i<cnt;i++){
            for(int j = 0; j<20;j++){
                if(students[i].stuAns[j]==ans[j]){
                    students[i].ox[j] = 'O';
                    students[i].score += 5;
                }
                else{
                    students[i].ox[j] = 'X';
                }
            }
        }
    }

    public void print(){
        System.out.print("id\tname\t");
        for(int i = 1; i <=20;i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        for(int i =0; i<cnt;i++){
            System.out.println(students[i].printStudent());
        }
        percentPerQ();
    }

    public void percentPerQ(){
        for(int i = 0; i < 20;i++){
            int o = 0;
            for(int j = 0; j <cnt; j++){
                if(students[j].stuAns[i]==ans[i]){
                    o++;

                }
            }
            ratio[i] = ((double)o/cnt)*100;
        }
        System.out.println();
        System.out.print("ratio:\t\t");
        for(int i = 0; i < ratio.length;i++){
            System.out.printf("%.1f",ratio[i]);
            System.out.print("%\t");
        }
    }

    public void sortStudents(){
        for(int i = 0; i< cnt-1;i++){
            for(int j = i+1; j<cnt;j++)
            if(students[i].id>students[j].id){
                Student tmp = students[i];
                students[i] = students[j];
                students[j] = tmp;
            }
        }
    }
}