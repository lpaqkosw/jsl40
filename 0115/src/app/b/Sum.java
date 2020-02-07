package app.b;

public class Sum{
    public String user;
    public int start;
    public int end;

    public Sum(String user, int start, int end) {
        this.user = user;
        this.start = start;
        this.end = end;
    }

    public void print(){
        System.out.println("\n사용자: "+this.user);
        int sum = 0;
        System.out.print("연산결과: ");
        for(int i = this.start; i <= this.end; i++){
            sum += i;
            if(i == this.end){
                System.out.print(i);
            }
            else{
                System.out.print(i+"+");
            }
        }
        System.out.print(" = "+sum);
    }
    
    
}