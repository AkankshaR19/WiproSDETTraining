package assignment_2;
import java.util.Scanner;

public class CurrencyConverter {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        System.out.println("1. USD");
        System.out.println("2. EUR");

        System.out.print("Choose conversion: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("USD: " + (inr / 83));
                break;
            case 2:
                System.out.println("EUR: " + (inr / 90));
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }

}
