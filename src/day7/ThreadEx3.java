package day7;
import java.lang.*;
class Order extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Order is being processed...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Order interrupted...");
        }
    }
}

class Payment extends Thread {
    public void run() {
        System.out.println("Payment is being processed...");
    }
}

class Notification extends Thread {
    public void run() {
        System.out.println("Notification sent...");
    }
}

public class ThreadEx3 {
    public static void main(String[] args) {
        Order o = new Order();
        Payment p = new Payment();
        Notification n = new Notification();

        o.start();
        p.start();
        n.start();
    }
}