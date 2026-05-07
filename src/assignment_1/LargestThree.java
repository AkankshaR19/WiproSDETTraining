package assignment_1;
import java.util.Scanner;
public class LargestThree {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a > b && a > c)
            System.out.println("Largest: " + a);
        else if (b > c)
            System.out.println("Largest: " + b);
        else
            System.out.println("Largest: " + c);

        sc.close();
    }

}
