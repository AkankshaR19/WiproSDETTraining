package day6;
import java.io.*;

public class Throws {
void readfile() throws IOException
{
	FileReader file = new FileReader("hello.txt");
		
	}
public static void main(String[] args) throws IOException
{
	Throws obj= new Throws();
	obj.readfile();
}

}
