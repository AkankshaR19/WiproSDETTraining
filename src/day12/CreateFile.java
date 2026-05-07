package day12;
import java.io.*;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) {
		try {
			File file = new File("amy.txt");
			if(file.createNewFile()) {
				System.out.println("File Created Successfully");
			}
			else {
				System.out.println("File Already Exists");
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
