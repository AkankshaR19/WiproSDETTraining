package assignment_1;
import java.util.Scanner;

public class SmallestThree {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter three numbers: ");
	        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

	        if (a < b && a < c)
	            System.out.println("Smallest: " + a);
	        else if (b < c)
	            System.out.println("Smallest: " + b);
	        else
	            System.out.println("Smallest: " + c);

	        sc.close();
	    }

}
