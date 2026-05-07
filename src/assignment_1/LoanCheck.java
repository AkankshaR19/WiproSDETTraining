package assignment_1;
import java.util.Scanner;
public class LoanCheck {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        if (age >= 21 && salary >= 25000)
            System.out.println("Eligible for loan");
        else
            System.out.println("Not eligible");

        sc.close();
    }

}
