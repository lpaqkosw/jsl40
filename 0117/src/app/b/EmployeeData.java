package app.b;

public class EmployeeData{
    Employee[] employees;
    int cnt;
    int total;
    double avg;
    int index;

    public EmployeeData(Employee[] employees, int cnt) {
        this.employees = employees;
        this.cnt = cnt;
        calcTot();
        calcAvg();
    }

    public void calcTot(){
        int max =0;
        for(int i = 0; i <cnt;i++){
            this.total += employees[i].totalPay;
            if(employees[i].totalPay > max){
                max = employees[i].totalPay;
                this.index = i;
            }
        }
    }

    public void calcAvg(){
        this.avg = (double)this.total/cnt;
    }
    
    public void printData(){
        System.out.println("\nid\trank\tWagePerTime\ttime\tpay");
        for(int i = 0; i <cnt;i++){
            employees[i].printWage();
        }
        
        System.out.println("\nTotalPay: "+String.format("%,d", total)+"\tAvg: "+String.format("%,.2f", avg));




        System.out.println("\nhighest Pay:\tid\tpay");
        System.out.println("\t\t"+employees[index].id+"\t"+String.format("%,d", employees[index].totalPay));
    }
        
    
}

    
