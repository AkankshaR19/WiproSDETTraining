package assignment_8;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> productPrice = new HashMap<>();
        productPrice.put("Laptop", 50000);
        productPrice.put("Phone", 20000);
        productPrice.put("Headphones", 2000);

        List<String> cart = new ArrayList<>();

        System.out.print("How many items do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Available products: " + productPrice.keySet());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String item = sc.nextLine();
            cart.add(item);
        }

        int total = 0;

        System.out.println("\nItems in cart:");
        for (String item : cart) {
            if (productPrice.containsKey(item)) {
                System.out.println(item + " - " + productPrice.get(item));
                total += productPrice.get(item);
            } else {
                System.out.println(item + " - Not available");
            }
        }

        System.out.println("Total amount: " + total);

        sc.close();
    }
}
