package app.a;

public class StudendData{
    Student[] students;
    int cnt;

    public StudendData(Student[] students, int cnt) {
        this.students = students;
        this.cnt = cnt;
        calcRank();
        sortByRank();
    }

    public void sortByRank(){
        for(int i = 0; i < cnt-1;i++){
            for(int j= 1+i; j < cnt;j++){
                if(this.students[i].rank > this.students[j].rank){
                    Student tmp = this.students[j];
                    this.students[j] = this.students[i];
                    this.students[i] = tmp;
                }
            }

        }
    }

    public void calcRank(){
        for(int i =0; i< cnt;i++){
            for(int j = 0; j <cnt;j++){
                if(this.students[i].tot > this.students[j].tot){
                    this.students[j].rank++;
                }
            }
        }
    }

    public void print(){
        System.out.println("\nid\tname\tkor\teng\tmath\ttot\tavg\trank");
        for(int i = 0; i < this.cnt;i++){
            this.students[i].printData();
        }
    }
}