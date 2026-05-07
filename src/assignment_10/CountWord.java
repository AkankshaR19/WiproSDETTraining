package assignment_10;
import java.io.*;
public class CountWord {
	public static void main(String[] args) throws Exception {
	       BufferedReader br = new BufferedReader(new FileReader("data.txt"));
	       String line;
	       int count = 0;
	       String target = "Java";
	       while ((line = br.readLine()) != null) {
	           String[] words = line.split("\\s+");
	           for (String w : words) {
	               if (w.equals(target)) {
	                   count++;
	               }
	           }
	       }
	       br.close();
	       System.out.println("Word '" + target + "' found " + count + " times.");
	   }


}
