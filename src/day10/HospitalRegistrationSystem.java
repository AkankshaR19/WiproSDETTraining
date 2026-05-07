package day10;

import java.util.*;

class Patient implements Comparable<Patient> {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Patient p) {
        return Integer.compare(this.id, p.id);
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class HospitalRegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Patient> patients = new TreeSet<>();

        while (true) {
            System.out.println("\n1.Add Patients  2.View Patients  3.Exit");
            int ch = sc.nextInt(); sc.nextLine();

            if (ch == 1) {
                System.out.print("Patient ID: ");
                int id = sc.nextInt(); sc.nextLine();
                System.out.print("Patient Name: ");
                String name = sc.nextLine();

                if (!patients.add(new Patient(id, name)))
                    System.out.println("Duplicate Patient ID!");
            } 
            else if (ch == 2) {
                if (patients.isEmpty()) System.out.println("No data added yet!");
                else patients.forEach(System.out::println);
            } 
            else break;
        }
        sc.close();
    }
}