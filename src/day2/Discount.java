package day2;

public class Discount {
	public static void main(String[] args) {

        int amount = 3000;
        int discount = 5;

        if (amount >= 5000) {
            discount = 20;
        } else if (amount >= 2000) {
            discount = 10;
        }

        int finalAmount = amount - (amount * discount / 100);

        System.out.println("Amount: " + amount);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Amount: " + finalAmount);
        
    }

}
