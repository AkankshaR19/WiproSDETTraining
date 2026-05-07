package assignment_9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Order implements Runnable {
    private int orderId;

    Order(int id) {
        this.orderId = id;
    }

    public void run() {
        System.out.println("Order " + orderId + " is being processed by " + Thread.currentThread().getName());
        try { Thread.sleep(1000); } catch (Exception e) {}
        System.out.println("Order " + orderId + " delivered");
    }
}

public class DeliverySystem {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            pool.execute(new Order(i));
        }

        pool.shutdown();
    }
}
