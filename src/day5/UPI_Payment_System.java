package day5;

import java.util.Scanner;

interface Payment {

 void pay(double amount); 

 default void success() {
     System.out.println("Transaction Successful");
 }
}

class GooglePay implements Payment {
 public void pay(double amount) {
     System.out.println("Paying Rs " + amount + " using Google Pay...");
 }
}

class PhonePe implements Payment {
 public void pay(double amount) {
     System.out.println("Paying Rs " + amount + " using PhonePe...");
 }
}

class Paytm implements Payment {
 public void pay(double amount) {
     System.out.println("Paying Rs " + amount + " using Paytm...");
 }
}

public class UPI_Payment_System {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Choose UPI App:");
     System.out.println("1. Google Pay");
     System.out.println("2. PhonePe");
     System.out.println("3. Paytm");

     int choice = sc.nextInt();

     System.out.print("Enter amount: ");
     double amount = sc.nextDouble();

     Payment p;

     switch (choice) {
         case 1:
             p = new GooglePay();
             break;
         case 2:
             p = new PhonePe();
             break;
         case 3:
             p = new Paytm();
             break;
         default:
             System.out.println("Invalid choice!");
             return;
     }

     p.pay(amount);
     p.success();  

     sc.close();
 }
}
