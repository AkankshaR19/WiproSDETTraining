package day2;

public class FoodMenu {
	public static void main(String[] args) {

        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Pasta");
                break;
            case 4:
                System.out.println("Soup");
                break;
            case 5:
                System.out.println("Noodles");
                break;
            case 6:
                System.out.println("Rolls");
                break;
            case 7:
                System.out.println("Milkshake");
                break;
            case 8:
                System.out.println("Pepsi");
                break;
            
            default:
                System.out.println("Invalid choice");
        }
    }

}
