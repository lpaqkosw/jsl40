package app.d;

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
        System.out.println("\n부서:\t\t사번:\t이름:\t급여:");
        System.out.println("=================================================");
        for(int i =0;i<cnt;i++){
                if(employees[i].getDivision().equals(tmp)){
                    employees[i].printData();
                    tmp = employees[i].getDivision();
                    this.totTmp += employees[i].getPay();
                    this.total += employees[i].getPay();
                    if(i==cnt-1){
                        System.out.println(tmp+" 합계: \t\t\t"+String.format("%,d", this.totTmp));
                    }
                }
                else{
                	if(i != 0) {
                		System.out.println(tmp+" 합계: \t\t\t"+String.format("%,d", this.totTmp)+"\n");                		
                	}
                    tmp = employees[i].getDivision();
                    employees[i].printFirst();
                    this.total += employees[i].getPay();
                    this.totTmp = employees[i].getPay();
                    if(i==cnt-1){
                        System.out.println(tmp+" 합계: \t\t\t"+String.format("%,d", this.totTmp));
                    }
                }
        }
        System.out.println("\nTotal\t\t\t\t"+String.format("%,d", total));
    }
}