package app.d;

import java.text.DecimalFormat;

public class Employee{
    public int id;
    public String name;
    public String wage;

    public Employee(String[] data) {
        DecimalFormat df = new DecimalFormat("#,###");
        this.id = Integer.parseInt(data[0]);
        this.name = data[1];
        this.wage = df.format(Integer.parseInt(data[2]));
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+wage;
    }

    


}