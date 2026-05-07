package day12;
import java.io.*;
class Employee implements Serializable {
 int id;
 String name;
 double salary;
 Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }
}
public class EmployeeManagement {
 public static void main(String[] args) {
     // Serialization
     try {
         Employee e1 = new Employee(101, "Akanksha", 50000);
         FileOutputStream fileOut =new FileOutputStream("employee.txt");
         ObjectOutputStream out =new ObjectOutputStream(fileOut);
         out.writeObject(e1);
         out.close();
         fileOut.close();
         System.out.println("Employee Object Saved\n");
     } catch (IOException e) {
         System.out.println(e);
     }
     // Deserialization
     try {
         FileInputStream fileIn =new FileInputStream("employee.txt");
         ObjectInputStream in =  new ObjectInputStream(fileIn);
         Employee e2 = (Employee) in.readObject();
         System.out.println("Employee Details:");
         System.out.println("Id: " + e2.id);
         System.out.println("Name: " + e2.name);
         System.out.println("Salary: " + e2.salary);
         in.close();
         fileIn.close();
     } catch (IOException e) {
         System.out.println(e);
     } catch (ClassNotFoundException e) {
         System.out.println(e);
     }
 }
}