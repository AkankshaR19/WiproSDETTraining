package day3;

class Employee {
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(50000);

        System.out.println("Salary: " + emp.getSalary());
    }
}
