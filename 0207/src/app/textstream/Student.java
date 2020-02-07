package app.textstream;

import java.text.DecimalFormat;

public class Student {
    int id;
    String name;
    String sex;
    int[] scores = new int[3];
    int tot =0;;
    double avg;

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.##");
        StringBuilder sb = new StringBuilder();
        sb.append(id+"\t");
        sb.append(name+"\t");
        sb.append(sex+"\t");
        for (int i = 0; i < scores.length; i++) {
            sb.append(scores[i]+"\t");
        }
        sb.append(tot+"\t");
        sb.append(df.format(avg)+"\t");

        return sb.toString();
    }

    public Student(String[] in) {
        this.id = Integer.parseInt(in[0]);
        this.name = in[1];
        this.sex = in[2];
        for(int i =0; i < scores.length;i++){
            this.scores[i] = Integer.parseInt(in[i+3]);
            this.tot += Integer.parseInt(in[i+3]);
        }
        this.avg = (double)tot/3;
    }
}