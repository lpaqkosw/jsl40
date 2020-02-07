package app.d;

public class Employee{
    private String division;
    private int id;
    private String name;
    private int pay;


    public void printData(){
        System.out.println("\t\t"+id+"\t"+name+"\t"+String.format("%,d", pay));
    }

    public void printFirst(){
        System.out.println(division+"\t\t"+id+"\t"+name+"\t"+String.format("%,d", pay));
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}