package day9;
import java.util.*;

class Student {
int id;
Student (int id){
	this.id=id;
}
	public int hashcode() {
		return id;
}
public boolean equals(Object obj) { //method to check duplicate objects
	Student s = (Student)obj;
	return this.id==s.id;
			}

}

public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet<Student>set=new HashSet<>();
		set.add(new Student(1));
		set.add(new Student(1));
		System.out.println(set.size());
	}

}
