package app.c;

public class School{
    Student[] students;
    int cnt;

    public School(Student[] students,int cnt) {
        this.students = students;
        this.cnt = cnt;
        calcRank();
        // ssort();
        //bsort();
    }
    
    public void calcRank(){
        for(int i =0;i<cnt;i++){
            for(int j = 0;j<cnt;j++){
                if(students[i].tot > students[j].tot){
                    students[j].rank++;
                }
            }
        }
    }

    public void ssort(){
        for(int i =0;i<cnt-1;i++){
            for(int j =i+1;j<cnt;j++){
                if(this.students[i].tot<this.students[j].tot);
                    Student tmp = this.students[i];
                    this.students[i] = this.students[j];
                    this.students[j] = tmp;
            }
        }
    }
    public void bsort(){
        for(int i =0;i<cnt-1;i++){
            for(int j =0;j<cnt-1-i;j++){
                if(students[j].rank>students[j+1].rank);
                    Student tmp = students[j+1];
                    students[j+1] = students[j];
                    students[j] = tmp;
            }
        }
    }

    public void print(){
        System.out.println("id\tname\teng\tkor\tmath\ttot\tavg\trank");
        for(int i =0;i<cnt;i++){
            System.out.println(students[i]);
        }
    }
}