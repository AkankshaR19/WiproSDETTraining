package day10;
import java.util.*;
public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer,String> map= new HashMap<>();
		map.put(101, "Amy");
		map.put(102, "Amyra");
		map.put(103, "Aman");
		map.put(104, "Aksh");
		
		System.out.println(map.get(101));
		
		map.remove(104);
		for(Integer key:map.keySet()) {
			System.out.println(key + " - " + map.get(key));
		}
	}

}
