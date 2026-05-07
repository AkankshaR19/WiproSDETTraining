package healthcare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientService service = new PatientServiceImpl();

        Doctor d1 = new GeneralPhysician("Dr A");
        Doctor d2 = new Cardiologist("Dr B");

        int choice;

        do {
            System.out.println("\n--- Healthcare Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Diagnose Patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Illness: ");
                    String illness = sc.nextLine();

                    Patient p = new Patient(id, name, age, illness);
                    service.addPatient(p);
                    break;

                case 2:
                    service.displayPatients();
                    break;

                case 3:
                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();

                    Patient patient = service.getPatientById(pid);

                    if (patient != null) {
                        System.out.println("1. General Physician");
                        System.out.println("2. Cardiologist");
                        int docChoice = sc.nextInt();

                        if (docChoice == 1) {
                            d1.diagnose(patient);
                        } else if (docChoice == 2) {
                            d2.diagnose(patient);
                        } else {
                            System.out.println("Invalid doctor choice");
                        }
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}