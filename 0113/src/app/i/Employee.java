package app.i;

import java.util.Arrays;

public class Employee {
    public int id;
    public String name;
    public int wage;
    public int[] unit = new int[10];

    public Employee(int id, String name, int wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
        listUnit(wage);
    }

    public int[] listUnit(int wage) {
        int u = 50000;
        int i = 0;
        while (i < 10) {
            this.unit[i] = wage/u;
            wage = wage%u;
            i++;
            if (i % 2 != 0) {
                u = u / 5;
            } else {
                u = u / 2;
            }
        }
        return unit;
    }

    void printData(){
        System.out.print(id+"\t"+name+"\t"+wage+"\t");
        for(int i =0; i < this.unit.length;i++){
            System.out.print(this.unit[i]+"\t");

        }
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", unit=" + Arrays.toString(unit) + ", wage=" + wage + "]";
    }
    
}