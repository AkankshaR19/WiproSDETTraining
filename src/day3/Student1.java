package day3;

class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Student1 {
    public static void main (String[] args) {
        Student s = new Student();
        s.setName("Amy");
        System.out.println(s.getName());
    }
}