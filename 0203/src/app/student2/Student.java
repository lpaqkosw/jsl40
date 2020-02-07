package app.student2;


public class Student implements Comparable{
    int id;
    String name;
    int[] score = new int[5];
    int tot=0;
    double avg=0;
    int rank=1;

    public Student() {
    }

    public Student(String[] in) {
        this.id = Integer.parseInt(in[0]);
        this.name = in[1];
        for(int i = 0; i < score.length; i++){
            this.score[i] = Integer.parseInt(in[i+2]);
            this.tot += Integer.parseInt(in[i+2]);
        }
        this.avg = (double)(int)(((double)tot/5)*100+0.5)/100.;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id+"\t");
        sb.append(name+"\t");
        for(int i =0;i<score.length;i++){
            sb.append(score[i]+"\t");
        }
        sb.append(tot+"\t");
        sb.append(avg+"\t");
        sb.append(rank+"\t");

        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if(this.rank > s.rank){
            return 1;
        }
        else if(this.rank < s.rank){
            return -1;
        }
        else{
            return 0;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student m = (Student) obj;
            return this.id == m.id;
        } 
        else {
            return false;

        }
    }

	
	



    

    
}