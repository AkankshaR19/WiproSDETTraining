package day2;
import java.util.Scanner;
public class EMPsalary {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] salaries = new int[10];

	        
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter salary of employee " + (i + 1) + ": ");
	            salaries[i] = sc.nextInt();
	        }

	        
	        System.out.println("\nUpdated Salaries:");

	        for (int i = 0; i < 10; i++) {
	            salaries[i] = salaries[i] + (salaries[i] * 10 / 100);
	            System.out.println("Employee " + (i + 1) + ": " + salaries[i]);
	        }

	        sc.close();
	    }
	}


