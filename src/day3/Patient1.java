package day3;
class Patient {
    private String name;
    private int age;
    private String disease;
    public void setDetails(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;        
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }   
    public String getDisease() {
        return disease;
    }    
}
public class Patient1 {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.setDetails("Amy", 21, "Flu");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Disease: " + p.getDisease());
    }
}
