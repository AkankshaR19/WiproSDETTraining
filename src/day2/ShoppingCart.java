package day2;
import java.util.Scanner;
public class ShoppingCart {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int price;

        while (true) {
            System.out.print("Enter item price (0 to stop): ");
            price = sc.nextInt();

            if (price == 0) {
                break;
            }

            total = total + price;
        }

        System.out.println("Total Amount: " + total);

        sc.close();
    } }


