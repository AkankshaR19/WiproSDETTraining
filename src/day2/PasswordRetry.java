package day2;
import java.util.Scanner;

public class PasswordRetry {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        String correctPassword = "1234";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter password: ");
            String entered = sc.nextLine();

            if (entered.equals(correctPassword)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Wrong Password");
            }

            attempts--;
        }

        if (attempts == 0) {
            System.out.println("All attempts failed");
        }

        sc.close();
    
    }

}
