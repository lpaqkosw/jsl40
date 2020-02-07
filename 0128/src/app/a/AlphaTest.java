package app.a;

public class AlphaTest{
    int[] num = new int[26];

    public void print(){
        for(int i = 65; i< 65+num.length;i++){
            System.out.print((char)i+"\t");
        }
        System.out.println();
        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]+"\t");
        }
        System.out.println();
        noOccurence();
        mostOccurence();
    }

    public void countLetters(String input){
        for(int i =0; i< input.length();i++){
            try {
                num[input.charAt(i)-65]++; 
            } catch (Exception e) {
                continue;
            }
        }
    }

    public void noOccurence(){
        System.out.println("\nNo Occurence");
        for(int i = 0; i < num.length;i++){
            if(this.num[i] == 0){
                System.out.print((char)(65+i)+"\t");
            }
        }
        System.out.println();
        for(int i = 0; i < num.length;i++){
            if(this.num[i] == 0){
                System.out.print(num[i]+"\t");
            }
        }
        System.out.println();
    }

    public void mostOccurence(){
        System.out.println("\nMost Occurence");
        char[] alphaTmp = new char[26];
        for(int i = 65;i<65+alphaTmp.length;i++){
            alphaTmp[i-65] = (char)i;
        }

        for(int i =0; i < num.length-1;i++){
            for(int j =i+1;j<num.length;j++){
                if(num[j]>num[i]){
                    int tmp = num[j];
                    num[j]=num[i];
                    num[i] = tmp;
                    char ctmp = alphaTmp[j];
                    alphaTmp[j] = alphaTmp[i];
                    alphaTmp[i] = ctmp;
                }
            }
        }

        for(int i = 0; i < num.length;i++){
            int most = num[0];
            if(num[i] == most){
                System.out.print(alphaTmp[i]+"\t");
            }
        }
        System.out.println();
        for(int i = 0; i < num.length;i++){
            int most = num[0];
            if(num[i] == most){
                System.out.print(num[i]+"\t");
            }
        }
        System.out.println();
        

    }
}