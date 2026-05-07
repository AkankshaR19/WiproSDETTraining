package assignment_2;
import java.util.Scanner;
public class UserRole {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter role (Admin/User/Guest): ");
        String role = sc.next().toLowerCase();

        switch (role) {
            case "admin": System.out.println("Full access"); break;
            case "user": System.out.println("Limited access"); break;
            case "guest": System.out.println("View only"); break;
            default: System.out.println("Invalid role");
        }

        sc.close();
    }

}
