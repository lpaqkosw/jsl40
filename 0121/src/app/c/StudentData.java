package app.c;

public class StudentData extends Student implements Account{
    int[] scores;
    double avg;


    @Override
    void print() {
        if(scores != null){
            System.out.print("id\tname\tscores");
            for(int j = 0; j<scores.length;j++){
                System.out.print("\t");
            }
            System.out.println("total\tavg");
            System.out.print(id+"\t"+name+"\t");
            for(int i = 0; i < scores.length;i++){
                System.out.print(scores[i]+"\t");
            }
            total(this.scores);
            System.out.println();
        }
        else if(scores ==null){
            System.out.println("id\tname\tscore\tavg");
            System.out.print(id+"\t"+name+"\t"+score);
            total(this.score);
        }
    }
    
    @Override
    public void total(int[] score) {
        int sum = 0;
        for(int i = 0; i < score.length;i++){
            sum += score[i];
        }
        avg = (double)(int)(((double)sum/score.length)*100+0.5)/100;
        System.out.print(sum+"\t"+avg);

    }

    @Override
    public void total(int score) {
        avg = score;
        System.out.println("\t"+avg);

    }

    public StudentData(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public StudentData(int id, String name, int[] score) {
        this.id = id;
        this.name = name;
        this.scores = score;
    }

}