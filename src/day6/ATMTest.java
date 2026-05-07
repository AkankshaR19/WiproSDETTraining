package day6;
import java.util.Scanner;

public class ATMTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int correctPin = 1907;

        try {            
            System.out.println("Card inserted successfully.");

            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin != correctPin) {
                throw new Exception("Incorrect PIN entered!");
            }

            System.out.println("PIN verified successfully.");
            System.out.println("Access granted. Welcome!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Thank you for using our ATM.");
            sc.close();
        }
    }
}