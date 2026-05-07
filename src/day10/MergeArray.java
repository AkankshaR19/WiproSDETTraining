package day10;
import java.util.*;;
public class MergeArray {
	public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Aman", "Amy"));
	ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Adi", "Abhi"));
	ArrayList<String> list3 = new ArrayList<>();
	list3.addAll(list1);
	list3.addAll(list2);
	System.out.println(list3);
	}
}
