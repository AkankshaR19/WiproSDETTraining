package day12;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EcommerceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();

        System.out.println("Enter Product Name:");
        String productName = sc.nextLine();

        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();

        System.out.println("Enter Product Price:");
        double price = sc.nextDouble();
        sc.nextLine();

        double total = quantity * price;

        System.out.println("Enter Shipping Address:");
        String address = sc.nextLine();

        System.out.println("Enter Contact Number:");
        String phone = sc.nextLine();

        try {

            String invoiceFile = customerName + "_Invoice.txt";

            FileWriter invoiceWriter = new FileWriter(invoiceFile);

            invoiceWriter.write("===== E-Commerce Invoice =====\n");
            invoiceWriter.write("Customer Name: " + customerName + "\n");
            invoiceWriter.write("Product Name: " + productName + "\n");
            invoiceWriter.write("Quantity: " + quantity + "\n");
            invoiceWriter.write("Price per Product: Rs " + price + "\n");
            invoiceWriter.write("Total Amount: Rs " + total + "\n");
            invoiceWriter.close();
            String shippingFile = customerName + "_ShippingDetails.txt";

            FileWriter shippingWriter = new FileWriter(shippingFile);

            shippingWriter.write("===== Shipping Details =====\n");
            shippingWriter.write("Customer Name: " + customerName + "\n");
            shippingWriter.write("Shipping Address: " + address + "\n");
            shippingWriter.write("Contact Number: " + phone + "\n");

            shippingWriter.close();

            System.out.println("Invoice and Shipping Details saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving files.");
        }

        sc.close();
    }
}