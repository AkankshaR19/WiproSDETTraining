package day12;
import java.io.*;
class Student implements Serializable {
 int id;
 String name;
 Student(int id, String name) {
     this.id = id;
     this.name = name;
 }
}
public class SerializationDemo {
    public static void main(String[] args) {
        // Serialization
        try {
            Student s1 = new Student(101, "Akanksha");
            FileOutputStream fileOut =new FileOutputStream("ak.txt");
           ObjectOutputStream out =new ObjectOutputStream(fileOut);
            out.writeObject(s1);
            out.close();
            fileOut.close();

            System.out.println("Object Serialized Successfully");

        } catch (IOException e) {

            System.out.println("Serialization Error: " + e);
        }
        // Deserialization
        try {

            FileInputStream fileIn =
                    new FileInputStream("ak.txt");
            ObjectInputStream in =
                    new ObjectInputStream(fileIn);

            Student s2 = (Student) in.readObject();

            System.out.println("Student Id: " + s2.id);
            System.out.println("Student Name: " + s2.name);

            in.close();
            fileIn.close();

        } catch (IOException e) {

            System.out.println("File Error: " + e);

        } catch (ClassNotFoundException e) {

            System.out.println("Class Error: " + e);
        }
    }
}
