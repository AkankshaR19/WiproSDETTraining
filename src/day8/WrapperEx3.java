package day8;

public class WrapperEx3 {
	public static void main(String[] args) {
		int a=10;
		Integer obj=a;
		int b=obj;
		
		System.out.println("Primitive: "+a);
		System.out.println("Wrapper: "+obj);
		System.out.println("Unboxed: "+b);
	}

}
