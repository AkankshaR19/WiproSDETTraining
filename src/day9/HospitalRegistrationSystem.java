package day9;
import java.util.*;
import java.util.Scanner;

class Patient2 {
    int id;
    String name;
    Patient2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int hashCode() {
        return id;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Patient2)) return false;
        Patient2 p = (Patient2) obj;
        return this.id == p.id;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
public class HospitalRegistrationSystem {
    public static void main(String[] args) {
        HashSet<Patient2> patients = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Patient Registration Menu ---");
            System.out.println("1. Register Patient");
            System.out.println("2. View Registered Patients");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    Patient2 newPatient = new Patient2(id, name);

                    if (patients.add(newPatient)) {
                        System.out.println("Patient added to the system.");
                    } else {
                        System.out.println("Patient with this ID is already registered.");
                    }
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patients registered yet.");
                    } else {
                        System.out.println("Registered Patients:");
                        for (Patient2 p : patients) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
