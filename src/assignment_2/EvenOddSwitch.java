package assignment_2;
import java.util.Scanner;
public class EvenOddSwitch {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
        }

        sc.close();
    }

}
