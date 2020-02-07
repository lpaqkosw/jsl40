package app.thread;
//multithreading
//Thread Class
//Runnable Interface

import java.awt.Toolkit;

// class AA extends Thread{

// }

// class BB implements Runnable{

//     @Override
//     public void run() {
//         // TODO Auto-generated method stub

//     }
    
// }
public class thread{
    public static void main(String[] args) {
        Toolkit tool = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            tool.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("beep");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
            }            
        }
    }
}