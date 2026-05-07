package healthcare;

// Patient class
class Patient {
    private int id;
    private String name;
    private int age;
    private String illness;

    public Patient(int id, String name, int age, String illness) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getIllness() { return illness; }
}

// Interface
interface PatientService {
    void addPatient(Patient p);
    void displayPatients();
    Patient getPatientById(int id);   
}

// Implementation
class PatientServiceImpl implements PatientService {

    Patient[] patients = new Patient[10];
    int count = 0;

    public void addPatient(Patient p) {
        if (count < patients.length) {
            patients[count] = p;
            count++;
            System.out.println("Patient added successfully!");
        } else {
            System.out.println("Storage full");
        }
    }

    public void displayPatients() {
        if (count == 0) {
            System.out.println("No patients found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            Patient p = patients[i];
            System.out.println(p.getId() + " " + p.getName() + " " + p.getAge() + " " + p.getIllness());
        }
    }

    public Patient getPatientById(int id) {
        for (int i = 0; i < count; i++) {
            if (patients[i].getId() == id) {
                return patients[i];
            }
        }
        return null;
    }
}

// Abstract class
abstract class Doctor {
    String name;

    public Doctor(String name) {
        this.name = name;
    }

    abstract void diagnose(Patient p);
}

// General Physician
class GeneralPhysician extends Doctor {
    public GeneralPhysician(String name) {
        super(name);
    }

    public void diagnose(Patient p) {
        System.out.println(name + " is treating " + p.getName());
    }
}

// Cardiologist
class Cardiologist extends Doctor {
    public Cardiologist(String name) {
        super(name);
    }

    public void diagnose(Patient p) {
        if (p.getIllness().toLowerCase().contains("heart")) {
            System.out.println(name + " found heart problem in " + p.getName());
        } else {
            System.out.println(name + " says no heart issue for " + p.getName());
        }
    }
}