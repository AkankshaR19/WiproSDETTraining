package day3;

class Voter {
    private String name;
    private int age;

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void checkEligibility() {
        if (age >= 18) {
            System.out.println(name + " is eligible to vote.");
        } else {
            System.out.println(name + " is not eligible.");
        }
    }
}

public class Voter1{
    public static void main(String[] args) {

        Voter v = new Voter();
        v.setDetails("Amy", 12);

        v.checkEligibility();
    }
}
