package day12;

import java.io.*;

public class ReadFileBuffer {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("amy.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}