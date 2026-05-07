package day12;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        String accountNumber = sc.nextLine();

        System.out.println("Enter Account Holder Name:");
        String accountHolder = sc.nextLine();

        System.out.println("Enter Transaction Type (Deposit/Withdraw):");
        String transactionType = sc.nextLine();

        System.out.println("Enter Transaction Amount:");
        double amount = sc.nextDouble();

        try {
            String transactionFile = accountHolder + "_TransactionHistory.txt";

            FileWriter writer = new FileWriter(transactionFile);

            writer.write("===== Transaction History =====\n");
            writer.write("Account Number: " + accountNumber + "\n");
            writer.write("Account Holder: " + accountHolder + "\n");
            writer.write("Transaction Type: " + transactionType + "\n");
            writer.write("Transaction Amount: Rs " + amount + "\n");

            writer.close();

            System.out.println("Transaction history saved successfully.");

            File file = new File(transactionFile);

            Scanner fileReader = new Scanner(file);

            System.out.println("\n===== Reading Account Details =====");

            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }

            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error while handling bank records.");
        }

        sc.close();
    }
}