package day7;
class Kitchen {
    public synchronized void process(String task) {
        try {
            System.out.println(task + " started by " + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println(task + " completed by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(task + " interrupted");
        }
    }
}
class FoodDelivery2 extends Thread {
    Kitchen k;
    String task;
    public FoodDelivery2(String task, String threadName, Kitchen k) {
        this.task = task;
        setName(threadName);
        this.k = k;
    }
    public void run() {
        k.process(task);
    }
}
public class Synchro_Multi {
    public static void main(String[] args) throws InterruptedException {
        Kitchen k = new Kitchen();
        FoodDelivery2 t1 = new FoodDelivery2("Order Processing", "FoodApp", k);
        FoodDelivery2 t2 = new FoodDelivery2("Food Preparation", "Kitchen", k);
        FoodDelivery2 t3 = new FoodDelivery2("Order Delivery", "Delivery Agent", k);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}