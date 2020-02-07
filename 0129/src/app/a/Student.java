package app.a;

import java.util.StringTokenizer;

public class Student {
    int id;
    String name;
    int[] scores = new int[5];

    public Student(int id,StringTokenizer st) {
        this.id = id;
        this.name = st.nextToken();
        for (int i = 0; st.hasMoreTokens(); i++) {
            this.scores[i] = Integer.parseInt(st.nextToken());
        }
        sortScores();
    }

    public void sortScores(){
        for(int i = 0; i < scores.length-1; i++){
            for(int j = i+1; j<scores.length; j++){
                if(scores[i]>scores[j]){
                    int tmp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tmp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id+"\t"+name+"\t");
        for(int i = 0; i < scores.length;i++){
            sb.append(scores[i]+"\t");
        }
        return sb.toString();
    }
    
}