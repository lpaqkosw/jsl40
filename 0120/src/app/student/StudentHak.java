package app.student;

public class StudentHak extends Student{

    @Override
    public void account() {
        this.tot =0;
        for(int i = 0; i<score.length;i++){
            this.tot += score[i];
        }
        this.avg = (double)this.tot/score.length;
        title();
        System.out.print(id+"\t"+name+"\t"+tot+"\t");
        System.out.printf("%.2f\n",avg);
    }

    @Override
    public void maxMin() {
        int max = score[0];
        int min = score[0];
        for(int i =0; i<score.length;i++){
            if(score[i] > max){
                max = score[i];
            }
            if(score[i] < min){
                min = score[i];
            }
        }

        System.out.println("\nmax = "+ max+"\tmin = "+min);
    }

    @Override
    public void scoreSelection() {
        for(int i = 0; i < score.length-1;i++){
            for(int j = i+1;j<score.length;j++){
                if(score[j]<score[i]){
                    int t = score[i];
                    score[i] = score[j];
                    score[j]=t;
                }
            }
        }
        
        for(int i=0;i<score.length;i++){
            System.out.print(score[i]+"\t");
        }
        System.out.println();
    }

    @Override
    public void scoreBubble() {
        for(int i = 0; i<score.length-1;i++){
            for(int j = 0;j<score.length-1-i;j++){
                if(score[j]>score[j+1]){
                    int t = score[j];
                    score[j] = score[j+1];
                    score[j+1] =t;
                }
            }
        }

        for(int i=0;i<score.length;i++){
            System.out.print(score[i]+"\t");
        }
        System.out.println();
    }

    public StudentHak(int id, String name, int[] score) {
        super(id, name, score);
    }

}