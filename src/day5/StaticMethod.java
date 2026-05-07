package day5;
interface math
{
	static int add(int a , int b) {
		return a+b;
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		int result=math.add(10,20);
		System.out.println(result);

	}

}
