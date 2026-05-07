package assignment_2;
import java.util.Scanner;
public class VowelSwitch {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = Character.toLowerCase(sc.next().charAt(0));

	        switch (ch) {
	            case 'a': case 'e': case 'i': case 'o': case 'u':
	                System.out.println("Vowel");
	                break;
	            default:
	                System.out.println("Consonant");
	        }

	        sc.close();
	    }

}
