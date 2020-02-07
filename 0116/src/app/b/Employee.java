package app.b;

public class Employee{
    public int id;
    public String name;
    public int wage;
    public int[] unit = new int[10];

    public Employee(int id, String name, int wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
        calcUnit();
    }

    public void calcUnit(){
        int tmpwage= this.wage;
        int tmp = 50000;
        int i =0;
        while(i <10){
            this.unit[i] = tmpwage/tmp;
            i++;
            tmpwage=tmpwage%tmp;
            if(i%2 !=0){
                tmp = tmp/5;
            }
            else{
                tmp = tmp/2;
            }
            }
        }
    

    public void printData(){
        System.out.print(id+"\t"+name+"\t"+String.format("%,d", wage)+"\t\t");
        for(int i = 0; i < unit.length;i++){
            System.out.print(this.unit[i]+"\t");
        }
        System.out.println();
    }
}