package day10;

import java.util.ArrayList;

public class MergeArray2 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(3);
		list1.add(4);
		list1.add(5);
		ArrayList<Integer> list3 = new ArrayList<>();
		
		for(Integer i : list1) {
			if (!list3.contains(i)) {
				list3.add(i);
			}
			
		}
		for(Integer i: list2) {
			if(!list3.contains(i)) {
				list3.add(i);
			}
		}
		System.out.println(list3);
	}

}
