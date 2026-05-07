package day9;
import java.util.*;
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		//
		//add
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Orange");
		
		System.out.println("Initial List: " +list);
		//add index element
		list.add(1, "Grapes");
		//get()
		System.out.println("Element at Index 2: " +list.get(2));
		//set()
		list.set(2,  "Pineapple");
		System.out.println("After set(): " +list);
		
		//remove index
		list.remove(3);
		System.out.println("After removing index 3: " +list);
		
		//remove object
		list.remove("Apple");
		System.out.println("After removing Apple: " +list);
		
		//size()
		System.out.println("size: " +list.size());
		
		//contains()
		System.out.println("Contains Mango? " +list.contains("Mango"));
		
		//isEmpty()
		System.out.println("Is Empty? " +list.isEmpty());
		
		//index()
		System.out.println("Index of Banana: " +list.indexOf("Banana"));
		//lastIndexOf()
		list.add("Banana");
		System.out.println("Last Index of Banana: " +list.lastIndexOf("Banana"));
		//sort()
		Collections.sort(list);
		list.clear();
		System.out.println("After clear(): " +list);
	}

}
