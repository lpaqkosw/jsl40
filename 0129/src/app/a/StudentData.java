package app.a;

public class StudentData{
    Student[] students;
    int cnt;

    public StudentData(Student[] students, int cnt) {
        this.students = students;
        this.cnt = cnt;
        sort();
    }
    
    public void printData(){
        System.out.println("id\tname\tscores");
        for(int i = 0; i < cnt; i++){
            System.out.println(students[i]);
        }
    }

    public void sort(){
        for(int i = 0; i < cnt-1; i++){
            for(int j= i +1; j < cnt; j++){
                if(students[j].id<students[i].id){
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                }
            }
        }
    }
}