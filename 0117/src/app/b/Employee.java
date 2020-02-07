package app.b;

public class Employee{
    public String id;
    public int rank;
    public int time;
    public int wagePerTime;
    public int totalPay =0;

    public Employee(String id, int rank, int time) {
        this.id = id;
        this.rank = rank;
        this.time = time;
        if(rank == 1){
            this.wagePerTime = 10000; 
        }
        else if(rank == 2){
            this.wagePerTime = 5000;
        }
        else if(rank == 3){
            this.wagePerTime = 2000;
        }

        calcTotalPay();

    }

    public void calcTotalPay(){
        if(this.time <=30){
            this.totalPay += (this.wagePerTime*this.time);
        }
        else if(this.time > 30 && this.time <=50){
                this.totalPay += ((30*this.wagePerTime)+((this.time-30)*1.5*this.wagePerTime));
        }
        else{
            this.totalPay += ((30*this.wagePerTime)+((20)*1.5*this.wagePerTime));
        }
    }
    

    public void printWage(){
        System.out.println(id+"\t"+rank+"\t"+String.format("%,d", wagePerTime)+"\t\t"+time+"\t"+String.format("%,d", totalPay));
    }

    
}