package assignment_1;
import java.util.Scanner;
public class LargestTwo {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        if (a > b)
	            System.out.println("Largest: " + a);
	        else
	            System.out.println("Largest: " + b);

	        sc.close();
	    }

}
