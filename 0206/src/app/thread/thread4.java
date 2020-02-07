package app.thread;

class AA extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class BB implements Runnable{
    @Override
    public void run() {
        int s =0;
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            s += i;
        }
        System.out.println("sum = "+ s);
    }
}
public class thread4{
    public static void main(String[] args) {
        Thread t1 = new AA();
        t1.start();
        BB bb = new BB();
        Thread t2 = new Thread(bb);
        t2.start();
    }
}