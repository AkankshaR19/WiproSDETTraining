package day8;
import java.util.*;
public class WrapperEx2 {
	public static void main(String[] args) {
		ArrayList<Double> prices = new ArrayList<>();
		prices.add(200.05);
		prices.add(299.49);
		prices.add(99.99);
		
		double total=0;
		for (Double price:prices) { //for each loop
			total+=price;
		}
		System.out.println("Total Price: " +total);
	}

}
