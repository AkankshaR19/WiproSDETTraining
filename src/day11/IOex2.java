package day11;
import java.io.*;
public class IOex2 {
	public static void main(String[] args) throws Exception {
		try {
		FileWriter fw=new FileWriter ("ak.txt");
		fw.write("Hello Java I/O");
		fw.close();
		System.out.println("File written successfully!");
		} catch (IOException e){
			System.out.println("Error occured: "+e.getMessage());
			
			
		}
	}

}
