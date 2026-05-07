package day12;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HospitalManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Patient ID:");
        String id = sc.nextLine();

        System.out.println("Enter Patient Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Disease:");
        String disease = sc.nextLine();

        System.out.println("Enter Doctor Name:");
        String doctor = sc.nextLine();
        String fileName = name + ".txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("===== Patient Record =====\n");
            writer.write("Patient ID: " + id + "\n");
            writer.write("Patient Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Disease: " + disease + "\n");
            writer.write("Doctor Name: " + doctor + "\n");
            writer.close();
            System.out.println("Patient record saved successfully in file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error while creating patient file.");
        }
        sc.close();
    }
}
