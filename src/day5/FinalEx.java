package day5;

class parent{
	final void show() {
	System.out.println("I am final method");
	}
}

public class FinalEx extends parent{
	
	public static void main(String[] args) {
		final int x=10;
		System.out.println(x);
	}

}
