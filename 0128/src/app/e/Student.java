package app.e;


public class Student {
    int id;
    String name;
    int[] stuAns;
    char[] ox = new char[20];
    int score =0;
    

    

    // public void mark(){
    //     for(int i = 0; i<ans.length;i++){
    //         if(ans[i] == stuAns[i]){
    //             ox[i] = 'o';
    //         }
    //         else{
    //             ox[i] = 'x';
    //         }
    //     }
    // }

    public String printStudent() {
        StringBuilder sb = new StringBuilder();
        sb.append(id+"\t"+name+"\t");
        for(int i = 0;i<stuAns.length;i++){
            sb.append(ox[i]+"       ");
        }
        sb.append(score);

        return sb.toString();
        
    }

    public Student(int id, String name, int[] stuAns) {
        this.id = id;
        this.name = name;
        this.stuAns = stuAns;
        
    }

}