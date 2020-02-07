package app.c;

public class DivisionTotal{
    Employee[] employees;
    int cnt;
    int totTmp;
    int total;

    public DivisionTotal(Employee[] employees, int cnt) {
        this.employees = employees;
        this.cnt = cnt;
    }
    
    public void printData(){
        String tmp = "";
        System.out.println("\nDivision:\tid:\tname:\tpay:");
        System.out.println("=================================================");
        for(int i =0;i<cnt;i++){
                if(employees[i].getDivision().equals(tmp)){
                    employees[i].printData();
                    tmp = employees[i].getDivision();
                    totTmp += employees[i].getPay();
                    this.total += employees[i].getPay();
                    if(i==cnt-1){
                        System.out.println(tmp+" total: \t\t\t"+String.format("%,d", this.totTmp));
                    }
                }
                else{
                    if(i!=0){
                        System.out.println(tmp+" total: \t\t\t"+String.format("%,d", this.totTmp)+"\n");
                    }
                    tmp = employees[i].getDivision();
                    employees[i].printFirst();
                    this.total += employees[i].getPay();
                    this.totTmp = employees[i].getPay();
                    if(i==cnt-1){
                        System.out.println(tmp+" total: \t\t\t"+String.format("%,d", this.totTmp));
                    }
                }
            }
        System.out.println("\nTotal\t\t\t\t"+String.format("%,d", total));

    }
}