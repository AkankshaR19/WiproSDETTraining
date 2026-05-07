package assignment_5;

import java.util.Scanner;

interface Payment {
    void makePayment(double amount);
}

class OnlinePayment implements Payment {

    @Override
    public void makePayment(double amount) {
        try {
            if (amount <= 0) {
                throw new Exception("Invalid amount! Payment must be greater than 0.");
            }

            System.out.println("Processing payment of ₹" + amount + "...");
            System.out.println("Payment successful!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


public class PaymentTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payment payment = new OnlinePayment();

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        payment.makePayment(amount);

        sc.close();
    }
}
