package assignment_10;
import java.io.*;
public class ReadJavaLines {
	 public static void main(String[] args) throws Exception {
	       BufferedReader br = new BufferedReader(new FileReader("data.txt"));
	       String line;
	       while ((line = br.readLine()) != null) {
	           if (line.contains("Java")) {
	               System.out.println(line);
	           }
	       }
	       br.close();
	   }


}
