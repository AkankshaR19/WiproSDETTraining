package assignment_2;
import java.util.Scanner;
public class Factorial {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int fact = 1, i = 1;

        while (i <= num) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial: " + fact);

        sc.close();
    }

}
