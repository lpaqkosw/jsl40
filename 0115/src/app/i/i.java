package app.i;

class Data{
    private static Data data = new Data();

    private Data(){}

    static Data getInstance(){
        return data;
    }
    }

public class i{
    public static void main(String[] args) {
        Data d1 = Data.getInstance();
        Data d2 = Data.getInstance();

        System.out.println(d2);
        
    }
}