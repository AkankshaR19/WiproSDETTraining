package day5;

interface add
{
	int sum (int a, int b);
}

public class LambdaEx3 {
	public static void main(String[] args) 
	{
		add obj=(a,b) -> a+b;
		System.out.println(obj.sum(10,20));
	}

}
