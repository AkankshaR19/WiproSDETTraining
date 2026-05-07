package day7;

class FoodDelivery extends Thread {
	public FoodDelivery (String name) {
		setName(name);
		
	}
	public void run() {
		try {
			System.out.println(getName()+ " started");
			Thread.sleep(2000);
			System.out.println(getName()+ " completed");
		}
		catch (InterruptedException e) {
			System.out.println(getName()+ " interrupted");
		}
	}
}
public class Multithreading {
	public static void main(String[] args) throws InterruptedException {
		FoodDelivery order = new FoodDelivery ("Order Processing");
		FoodDelivery kitchen = new FoodDelivery ("Food Preparation");
		FoodDelivery delivery = new FoodDelivery ("Order Delivery");
		
		order.setPriority(Thread.MAX_PRIORITY);
		kitchen.setPriority(Thread.NORM_PRIORITY);
		delivery.setPriority(Thread.MIN_PRIORITY);
		
		order.start();
		order.join();
		kitchen.start();
		
		System.out.println("Is Order Alive? " +order.isAlive());
		
		kitchen.join();
		delivery.start();
		delivery.join();
		System.out.println("All tasks completed!");
		
	}

}
