package day9;
import java.util.*;

class Patient {
    String name;
    int age;
    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class PatientManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();
        while (true) {
            System.out.println("\n--- Patient Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient by Name");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    // Add patient
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = sc.nextInt();
                    patients.add(new Patient(name, age));
                    System.out.println("Patient added successfully.");
                    break;
                case 2:
                    // View all
                    if (patients.isEmpty()) {
                        System.out.println("No patients available.");
                    } else {
                        System.out.println("Patient List:");
                        for (Patient p : patients) {
                            System.out.println("Name: " + p.name + ", Age: " + p.age);
                        }
                    }
                    break;
                case 3:
                    // Search
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();

                    boolean found = false;
                    for (Patient p : patients) {
                        if (p.name.equalsIgnoreCase(search)) {
                            System.out.println("Patient Found -> Name: " + p.name + ", Age: " + p.age);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Patient not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}