package assignment_6;

public class BooleanWrapperDemo {
	 public static void main(String[] args) {
	        Boolean first = true;
	        Boolean second = Boolean.valueOf("false");

	        System.out.println("First value: " + first);
	        System.out.println("Second value: " + second);

	        if (first) {
	            System.out.println("First is true");
	        }
	    }

}
