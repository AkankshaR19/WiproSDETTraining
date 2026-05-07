package day9;
import java.util.*;
public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Mango");
		set.add("Apple");
		
		System.out.println("Set: "+set);
	}

}
