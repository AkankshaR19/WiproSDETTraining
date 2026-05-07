package assignment_10;
import java.io.*;
import java.util.Scanner;

public class AppendFile {
	public static void main(String[] args) throws Exception {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter text: ");
	       String data = sc.nextLine();
	       FileWriter fw = new FileWriter("data.txt", true);
	       fw.write(data + "\n");
	       fw.close();
	       sc.close();
	       System.out.println("Data appended successfully.");
	   }


}
