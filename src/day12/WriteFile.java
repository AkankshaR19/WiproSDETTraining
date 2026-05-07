package day12;
import java.io.*;
import java.io.IOException;
public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("amy.txt");
			writer.write("Welcome to Java IO Classes");
			writer.write("\nLearning File Handling");
			writer.close();
			System.out.println("Data Written Successfully");
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
