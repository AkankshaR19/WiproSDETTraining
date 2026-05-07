package day9;
import java.util.LinkedList;
import java.util.Scanner;

class Patient1 {
    String name;
    int age;
    Patient1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}
public class HospitalQueueSystem {
    public static void main(String[] args) {
        LinkedList<Patient1> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Hospital Queue Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Emergency Patient (Front)");
            System.out.println("3. Remove Patient");
            System.out.println("4. View All Patients");
            System.out.println("5. Check First & Last Patient");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
               case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    queue.addLast(new Patient1(name, age));
                    System.out.println("Patient added to queue.");
                    break;

                case 2:
                    System.out.print("Enter emergency patient name: ");
                    String eName = sc.nextLine();
                    System.out.print("Enter age: ");
                    int eAge = sc.nextInt();
                    queue.addFirst(new Patient1(eName, eAge));
                    System.out.println("Emergency patient added at front.");
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("No patients to remove.");
                    } else {
                        Patient1 removed = queue.removeFirst();
                        System.out.println("Removed: " + removed);
                    }
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Patients in queue:");
                        for (Patient1 p : queue) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("First Patient: " + queue.getFirst());
                        System.out.println("Last Patient: " + queue.getLast());
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
