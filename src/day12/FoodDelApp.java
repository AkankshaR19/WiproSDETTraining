package day12;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FoodDelApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Order ID:");
        String orderId = sc.nextLine();

        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();

        System.out.println("Enter Food Item:");
        String foodItem = sc.nextLine();

        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Delivery Address:");
        String address = sc.nextLine();

        System.out.println("Enter Delivery Status:");
        String status = sc.nextLine();

        try {

            String orderFile = customerName + "_Order.txt";

            FileWriter orderWriter = new FileWriter(orderFile);

            orderWriter.write("===== Food Order Details =====\n");
            orderWriter.write("Order ID: " + orderId + "\n");
            orderWriter.write("Customer Name: " + customerName + "\n");
            orderWriter.write("Food Item: " + foodItem + "\n");
            orderWriter.write("Quantity: " + quantity + "\n");
            orderWriter.write("Delivery Address: " + address + "\n");

            orderWriter.close();

            String logFile = "DeliveryLog_" + orderId + ".txt";

            FileWriter logWriter = new FileWriter(logFile);

            logWriter.write("===== Delivery Log =====\n");
            logWriter.write("Order ID: " + orderId + "\n");
            logWriter.write("Customer Name: " + customerName + "\n");
            logWriter.write("Delivery Status: " + status + "\n");

            logWriter.close();

            FileWriter menuWriter = new FileWriter("Menu.txt");

            menuWriter.write("===== Restaurant Menu =====\n");
            menuWriter.write("Burger - Rs 120\n");
            menuWriter.write("Pizza - Rs 250\n");
            menuWriter.write("Pasta - Rs 180\n");
            menuWriter.write("Cold Coffee - Rs 90\n");

            menuWriter.close();

            System.out.println("Order, Menu, and Delivery Logs saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving files.");
        }

        sc.close();
    }
}
