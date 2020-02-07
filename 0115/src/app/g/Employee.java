package app.g;

public class Employee{
    int id;
    String name;
    int wage;

    public Employee(int id, String name, int wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public void print(){
        System.out.println(id+"\t"+name+"\t"+wage);
    }

}