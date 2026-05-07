package assignment_2;
import java.util.Scanner;
public class ATMSystem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000;
        int choice;

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Updated Balance: " + balance);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Remaining Balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    sc.close();
                    return; // stops program

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
               