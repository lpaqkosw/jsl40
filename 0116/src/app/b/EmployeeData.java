package app.b;

public class EmployeeData{
    Employee[] employees;
    int cnt;
    int total=0;
    int[] totalUnit = new int[10];

    public void calcTotal(){
        for(int i = 0; i<cnt;i++){
            total += this.employees[i].wage;
            for(int j = 0; j<10;j++){
                this.totalUnit[j] += this.employees[i].unit[j];
            }
        }
    }

    public EmployeeData(Employee[] employees, int cnt) {
        this.employees = employees;
        this.cnt = cnt;
        calcTotal();
    }


    public void print(){
        System.out.println("id\tname\twage\t\t50000: \t10000:\t5000:\t1000:\t500:\t100:\t50:\t10:\t5:\t\t1:");
        for(int i = 0; i < cnt; i++){
            employees[i].printData();
        }
        System.out.print("\nTotal:\t\t"+String.format("%,d", total)+"\t");
        for(int i = 0; i<totalUnit.length;i++){
            System.out.print(totalUnit[i]+"\t");
        }
    }

}