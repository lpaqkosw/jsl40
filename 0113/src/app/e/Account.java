package app.e;


public class Account {
    public int n;
    public int m;  

    void add(){
        System.out.println(n+m);
    }

    void sub(){
        if(n>m){
            System.out.println(n-m);
        }

        if(m>n){
            System.out.println(m-n);
        }
    }

    void mul(){
        System.out.println(n*m);
    }

    void div(){
        System.out.println((double)n/m);
    }

    public Account(int n, int m) {
        this.n = n;
        this.m = m;
    }
    
}