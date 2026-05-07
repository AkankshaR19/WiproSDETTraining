package day2;

import java.util.Scanner;

public class ATMmenu {
	
	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("\n1. Check Balance");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Balance: 5000");
	                    break;
	                case 2:
	                    System.out.println("Withdraw successful");
	                    break;
	                case 3:
	                    System.out.println("Deposit successful");
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	            }

	        } while (choice != 4);

	        sc.close();
	                    
	            
    }

}
