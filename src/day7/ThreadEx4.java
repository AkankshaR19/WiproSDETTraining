package day7;
import java.lang.*;

class Order1 implements Runnable {
    public void run() {
        try {            
                System.out.println("Order is being processed...");
                Thread.sleep(1000);
           
        } catch (InterruptedException e) {
            System.out.println("Order interrupted...");
        }
    }
}

class Payment1 implements Runnable {
    public void run() {
        System.out.println("Payment is being processed...");
    }
}

class Notification1 implements Runnable {
    public void run() {
        System.out.println("Notification sent...");
    }
}

public class ThreadEx4 {
    public static void main(String[] args) throws InterruptedException{
    	Order1 o = new Order1();
        Payment1 p = new Payment1();
        Notification1 n = new Notification1();
    	
    	Thread t1 = new Thread(o);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(n);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
