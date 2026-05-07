package assignment_1;
import java.util.Scanner;
public class Divisible3or7 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 7 == 0)
            System.out.println("Divisible by 3 or 7");
        else
            System.out.println("Not divisible");

        sc.close();
    }

}
