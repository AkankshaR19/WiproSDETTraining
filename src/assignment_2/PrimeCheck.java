package assignment_2;
import java.util.Scanner;
public class PrimeCheck {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        int i = 2;
	        boolean isPrime = true;

	        while (i <= num / 2) {
	            if (num % i == 0) {
	                isPrime = false;
	                break;
	            }
	            i++;
	        }

	        if (num <= 1) isPrime = false;

	        if (isPrime)
	            System.out.println("Prime");
	        else
	            System.out.println("Not Prime");

	        sc.close();
	    }

}
