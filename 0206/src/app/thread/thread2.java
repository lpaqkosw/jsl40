package app.thread;
//Thread class

class Beep extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("sound");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }
    }
      
}
public class thread2{
    public static void main(String[] args) {
        new Beep().start();
        for (int i = 0; i < 10; i++) {
            System.out.println("beep");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }            
        }
    }
}