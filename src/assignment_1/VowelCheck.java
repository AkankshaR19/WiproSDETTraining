package assignment_1;
import java.util.Scanner;
public class VowelCheck {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().toLowerCase().charAt(0);

	        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	            System.out.println("Vowel");
	        else
	            System.out.println("Consonant");

	        sc.close();
	    }

}
