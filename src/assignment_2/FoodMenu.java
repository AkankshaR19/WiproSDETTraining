package assignment_2;
import java.util.Scanner;
public class FoodMenu {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Pasta");

        System.out.print("Select item number: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Burger - Rs.150"); break;
            case 2: System.out.println("Pizza - Rs.300"); break;
            case 3: System.out.println("Pasta - Rs.200"); break;
            default: System.out.println("Invalid choice");
        }

        sc.close();
    }

}
